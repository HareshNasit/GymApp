package com.example.harshnasit.refit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataHandler extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "Refit.db";
    public static final String EXERCISE_TABLE = "exercise_table";
    public static final String EXERCISE_ID = "exercise_id";
    public static final String EXERCISE_NAME = "exercise_name";
    public static final String EXERCISE_DESCRIPTION = "exercise_description";
    public static final String EXERCISE_DEFAULT_SET = "exercise_default_sets";
    public static final String EXERCISE_DEFAULT_REPS = "exercise_default_reps";
    public static final String EXERCISE_TYPE_ID = "exercise_type_id";
    public static final String EXERCISE_TYPE_TABLE = "exercise_type_table";
    public static final String EXERCISE_TYPE_NAME = "exercise_type_name";


    public DataHandler(Context context){
        super(context, DATABASE_NAME,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + EXERCISE_TABLE +
                "(" + EXERCISE_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                    EXERCISE_NAME + "TEXT," +
                    EXERCISE_DESCRIPTION + "TEXT," +
                    EXERCISE_DEFAULT_SET + "INTEGER," +
                    EXERCISE_DEFAULT_REPS + "INTEGER," +
                    EXERCISE_TYPE_ID + "INTEGER," +
                    "FOREIGN KEY" + "(" + EXERCISE_TYPE_ID + ") REFERENCES " + EXERCISE_TYPE_TABLE + "(" + EXERCISE_TYPE_ID + "));"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
