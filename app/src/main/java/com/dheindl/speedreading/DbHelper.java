package com.dheindl.speedreading;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dennis on 05.12.2015.
 */
public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "SPEEDREADING.DB";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY =
            "CREATE TABLE " + User.NewUser.TABLE_NAME + " (" + User.NewUser.USER_NAME + " TEXT," + User.NewUser.USER_WPM + " TEXT," +
                    User.NewUser.USER_M + " TEXT);";


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
