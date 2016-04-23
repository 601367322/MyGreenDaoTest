package com.green.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.test.greendao.DaoMaster;


/**
 * 自定义类继承OpenHelper
 * 可以操作更新数据库
 * Created by shenbingbing on 16/4/18.
 */
public class MyOpenHelper extends DaoMaster.OpenHelper {

    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    /**
     * 更新数据库
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion){
            case 1:
                System.out.println("123123123");
                break;
        }
    }
}
