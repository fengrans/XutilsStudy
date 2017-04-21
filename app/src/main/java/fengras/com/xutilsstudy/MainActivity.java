package fengras.com.xutilsstudy;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.db.sqlite.Selector;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.xutils.DbManager;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import fengras.com.xutilsstudy.adapter.MyAdapter;
import fengras.com.xutilsstudy.bean.MyNews;
import okhttp3.Call;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sp;
    private List<MyNews.DataBean> list=new ArrayList<MyNews.DataBean>();
    private SharedPreferences.Editor edit;
    boolean flag=false;
    private ImageView head;
    private String str="http://m.yunifang.com/yunifang/mobile/goods/getall?random=60305&encode=b0358434fda8d7478bfc325b5828b721&category_id=17";
    private DbManager.DaoConfig dd = new DbManager.DaoConfig().setDbName("ps.db").setDbOpenListener(new DbManager.DbOpenListener() {

        @Override
        public void onDbOpened(DbManager db) {
            db.getDatabase().enableWriteAheadLogging();
        }
    });
    private DbManager db = x.getDb(dd);
    private ListView lv;
    private ListView listView;
    private DbUtils dbUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbUtils = DbUtils.create(this);
        try {
            dbUtils.createTableIfNotExist(MyNews.DataBean.class);
        } catch ( Exception e) {
            e.printStackTrace();
        }

        listView = (ListView) findViewById(R.id.lv);
        sp=getSharedPreferences("conf",MODE_PRIVATE);
        edit=sp.edit();
        boolean fa = sp.getBoolean("boolean", false);
        if(fa){
            try {
                getdatabase();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            getdata();
        }




    }

    private void getdatabase() throws  Exception {
        List<MyNews.DataBean> list = dbUtils.findAll(Selector.from(MyNews.DataBean.class).orderBy("shop_price",true));
Log.e("Ss",list.toString());
        MyAdapter mm=new MyAdapter(list,MainActivity.this);
        listView.setAdapter(mm);
    }

    private void getdata() {
        OkHttpUtils.get().url(str).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                Log.e("ss",e.toString());
            }

            @Override
            public void onResponse(String response, int id) {
                Gson gson=new Gson();
                MyNews myNews = gson.fromJson(response, MyNews.class);
                list=myNews.getData();
                MyAdapter mm=new MyAdapter(myNews.getData(),MainActivity.this);
                listView.setAdapter(mm);
                try {
                    dbUtils.saveAll(list);
                    dbUtils.close();
                    edit.putBoolean("boolean",true).commit();
                } catch ( Exception e) {
                    e.printStackTrace();
                }
            }
        });



    }


}
