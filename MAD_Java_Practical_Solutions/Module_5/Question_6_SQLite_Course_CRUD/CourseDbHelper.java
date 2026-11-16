package com.example.madpracticals;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CourseDbHelper extends SQLiteOpenHelper {
 public CourseDbHelper(Context c){super(c,"course.db",null,1);}
 @Override public void onCreate(SQLiteDatabase db){
  db.execSQL("CREATE TABLE course(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, duration TEXT, description TEXT)");
 }
 @Override public void onUpgrade(SQLiteDatabase db,int oldV,int newV){
  db.execSQL("DROP TABLE IF EXISTS course"); onCreate(db);
 }
 public long add(String name,String duration,String description){
  ContentValues v=new ContentValues();v.put("name",name);v.put("duration",duration);v.put("description",description);
  return getWritableDatabase().insert("course",null,v);
 }
 public int update(int id,String name,String duration,String description){
  ContentValues v=new ContentValues();v.put("name",name);v.put("duration",duration);v.put("description",description);
  return getWritableDatabase().update("course",v,"id=?",new String[]{String.valueOf(id)});
 }
 public int delete(int id){return getWritableDatabase().delete("course","id=?",new String[]{String.valueOf(id)});}
 public Cursor readAll(){return getReadableDatabase().rawQuery("SELECT id,name,duration,description FROM course ORDER BY id",null);}
}
