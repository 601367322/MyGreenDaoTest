package com.green.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.test.greendao.DaoMaster;
import com.test.greendao.DaoSession;

public class MyDatabaseLoader {

    private static final String DATABASE_NAME = "Test-db";
    private static DaoSession daoSession;

    /**
     * 在Application中调用,初始化数据库
     * @param context
     */
    public static void init(Context context) {
        MyOpenHelper helper = new MyOpenHelper(context, DATABASE_NAME, null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession() {
        return daoSession;
    }
}
