# Module 5 – Question 4: Change screen colour from menu

Add this menu resource at `res/menu/color_menu.xml` and use the Activity code below.

`res/menu/color_menu.xml`:
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
 <item android:id="@+id/red" android:title="Red"/>
 <item android:id="@+id/green" android:title="Green"/>
 <item android:id="@+id/blue" android:title="Blue"/>
</menu>
```

`MainActivity.java`:
```java
package com.example.madpracticals;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 LinearLayout root;
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b); root=new LinearLayout(this); root.setBackgroundColor(Color.WHITE); setContentView(root);
 }
 @Override public boolean onCreateOptionsMenu(Menu menu) {
  getMenuInflater().inflate(R.menu.color_menu,menu); return true;
 }
 @Override public boolean onOptionsItemSelected(@NonNull MenuItem item) {
  int id=item.getItemId();
  if(id==R.id.red) root.setBackgroundColor(Color.RED);
  else if(id==R.id.green) root.setBackgroundColor(Color.GREEN);
  else if(id==R.id.blue) root.setBackgroundColor(Color.BLUE);
  else return super.onOptionsItemSelected(item);
  return true;
 }
}
```
