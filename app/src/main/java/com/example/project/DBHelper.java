package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "inHouse.db";
    public DBHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(username TEXT primary key, password TEXT)");
        MyDB.execSQL("create Table orders(ord_id int primary key,ord_name TEXT,date Date,time TEXT,address TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");
        MyDB.execSQL("drop Table if exists orders");
    }

    public Boolean insertData(String username, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = MyDB.insert("users", null, contentValues);
        if(result==-1) return false;
        else
            return true;
    }


    public Boolean insertOrderData(int ord_id,String ord_name,String address){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("orderId",ord_id);
        contentValues.put("orderName",ord_name);
        contentValues.put("Address",address);
        long result=MyDB.insert("orders",null,contentValues);
        if(result==-1) return false;
        else
            return true;
    }


    public boolean updateOtherColumns(int ord_id, String order_name) {
        SQLiteDatabase MyDB= this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("orderName", order_name);
        long result = MyDB.update("orders", contentValues, "id=?", new String[] { String.valueOf(ord_id) });
        if(result==-1) return false;
        else
            return true;
    }


    public Boolean checkusername(String username) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String username, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
