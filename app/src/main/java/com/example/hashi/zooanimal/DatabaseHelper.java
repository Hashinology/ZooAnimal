package com.example.hashi.zooanimal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static String DATABASE_NAME = "animal_database";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_ANIMAL = "animal";
    private static final String KEY_ID = "id";
    private static final String KEY_FIRSTNAME = "name";

    public DatabaseHelper(Context context) {
        super(context, KEY_FIRSTNAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}