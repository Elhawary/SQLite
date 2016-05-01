package com.example.bassemsarhan.sql_lit;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.security.PublicKey;

/**
 * Created by Bassem Sarhan on 25-Jan-16.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    private   static final  int DATABASE_VERION = 1;
    private static final String DATABASE_NAME = "Emp";
    private  static  final String TABLE_NAME = "Emp_INFO";

    private static  final String Emp_ID = "id";
    private static final String Emp_name = "name";
    private  static final  String Emp_phone = "phone";

    public DatabaseHandler(Context context) {
        super(context , DATABASE_NAME, null, DATABASE_VERION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String Create_Table = "CREATE TABLE" + TABLE_NAME +"("+Emp_ID +" TEXT," + Emp_name +"TEXT ,"
                + Emp_phone +"TEXT" +")";
        db.execSQL(Create_Table);
    }

    public  void  addContact(contact con){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Emp_ID, con.getID());
        values.put(Emp_name , con.getName());
        values.put(Emp_phone , con.getPhone());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
