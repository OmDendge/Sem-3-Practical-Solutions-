package com.example.madpracticals;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b); setContentView(R.layout.activity_main);
  EditText u=findViewById(R.id.username), p=findViewById(R.id.password);
  findViewById(R.id.login).setOnClickListener(v -> {
   String user=u.getText().toString().trim(), pass=p.getText().toString();
   if(user.isEmpty() || pass.isEmpty()) {
    Toast.makeText(this,"Enter username and password",Toast.LENGTH_SHORT).show();
   } else if(user.equals("admin") && pass.equals("admin123")) {
    Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show();
   } else Toast.makeText(this,"Invalid username or password",Toast.LENGTH_SHORT).show();
  });
 }
}
