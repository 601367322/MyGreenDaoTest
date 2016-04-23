package com.green.test;

import android.app.Application;

import com.green.dao.MyDatabaseLoader;

/**
 * Created by shenbingbing on 16/4/23.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //创建数据库
        MyDatabaseLoader.init(this);
    }
}
