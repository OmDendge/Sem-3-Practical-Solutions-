package com.example.madpracticals;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDbHelper extends SQLiteOpenHelper {
 private static final String DB="users.db"; private static final int VERSION=1;
 public UserDbHelper(Context c){super(c,DB,null,VERSION);}
 @Override public void onCreate(SQLiteDatabase db){
  db.execSQL("CREATE TABLE users(id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT UNIQUE NOT NULL, password_hash TEXT NOT NULL)");
 }
 @Override public void onUpgrade(SQLiteDatabase db,int oldV,int newV){db.execSQL("DROP TABLE IF EXISTS users");onCreate(db);}
 public boolean insertUser(String username,String passwordHash){
  SQLiteDatabase db=getWritableDatabase(); ContentValues v=new ContentValues();
  v.put("username",username); v.put("password_hash",passwordHash);
  return db.insert("users",null,v)!=-1;
 }
 public Cursor getUsers(){return getReadableDatabase().rawQuery("SELECT id, username FROM users",null);}
}
