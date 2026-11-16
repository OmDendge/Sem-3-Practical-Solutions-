package com.example.madpracticals;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout root=new LinearLayout(this); root.setOrientation(1); root.setPadding(24,24,24,24);
  EditText user=new EditText(this); user.setHint("Username");
  EditText pass=new EditText(this); pass.setHint("Password"); pass.setInputType(129);
  Button signup=new Button(this); signup.setText("Sign Up");
  root.addView(user); root.addView(pass); root.addView(signup); setContentView(root);
  signup.setOnClickListener(v -> {
   String u=user.getText().toString().trim(), p=pass.getText().toString();
   boolean valid=p.length()>=8 && p.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+");
   if(u.isEmpty() || !valid) { Toast.makeText(this,"Password needs 8+ chars, upper, lower, number and special character",Toast.LENGTH_LONG).show(); return; }
   Intent i=new Intent(this,LoginActivity.class); i.putExtra("username",u); i.putExtra("password",p); startActivity(i);
  });
 }
}
