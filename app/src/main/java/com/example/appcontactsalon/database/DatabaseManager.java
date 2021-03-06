package com.example.appcontactsalon.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME= "mydb.sqlite";
    private static final int CURRENT_DB_VERSION = 1;

    private static DatabaseManager instance;

    public static DatabaseManager getInstance(Context context){
        if(instance==null){
            instance= new DatabaseManager(context);
        }
        return instance;
    }

    private DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, CURRENT_DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table salon (id INTEGER PRIMARY KEY AUTOINCREMENT, libelle TEXT, created_up TEXT)");
        //db.execSQL("create table inscription (id INTEGER, firstname TEXT, lastname TEXT, birthdate TEXT, adress TEXT, city TEXT, postalcode INTEGER, phone TEXT, mobilephone TEXT, email TEXT, chosencourse TEXT, lastdiploma TEXT, coursetype TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
