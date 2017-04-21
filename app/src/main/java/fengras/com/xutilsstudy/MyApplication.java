package fengras.com.xutilsstudy;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/4/21.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        // 设置是否输出debug
        x.Ext.setDebug(true);
    }
}
