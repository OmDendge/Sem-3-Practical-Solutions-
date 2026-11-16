package com.example.madpracticals;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SuccessActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) { super.onCreate(b); TextView t=new TextView(this); t.setText("Successful Login"); t.setTextSize(26); t.setGravity(17); setContentView(t); }
}
