package fengras.com.xutilsstudy.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import fengras.com.xutilsstudy.R;
import fengras.com.xutilsstudy.bean.MyNews;

/**
 * Created by Administrator on 2017/4/21.
 */
public class MyAdapter extends BaseAdapter {
    private List<MyNews.DataBean>list;
    private Context context;

    public MyAdapter(List<MyNews.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=View.inflate(context, R.layout.listviewitem,null);
        ImageView head= (ImageView) convertView.findViewById(R.id.head);
        TextView tv_title= (TextView) convertView.findViewById(R.id.tv_title);
        Glide.with(context).load(list.get(position).getGoods_img()).into(head);
        tv_title.setText(list.get(position).getShop_price()+"");
        return convertView;
    }
}
