package com.example.madpracticals;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
 private int attempts=0;
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  String savedUser=getIntent().getStringExtra("username"), savedPass=getIntent().getStringExtra("password");
  LinearLayout root=new LinearLayout(this); root.setOrientation(1); root.setPadding(24,24,24,24);
  EditText user=new EditText(this); user.setHint("Username");
  EditText pass=new EditText(this); pass.setHint("Password"); pass.setInputType(129);
  Button login=new Button(this); login.setText("Sign In");
  root.addView(user); root.addView(pass); root.addView(login); setContentView(root);
  login.setOnClickListener(v -> {
   if(attempts>=2){login.setEnabled(false); Toast.makeText(this,"Failed Login Attempts",Toast.LENGTH_LONG).show();return;}
   if(savedUser.equals(user.getText().toString().trim()) && savedPass.equals(pass.getText().toString())) {
    Intent ok=new Intent(this,SuccessActivity.class); startActivity(ok); finish();
   } else {
    attempts++;
    if(attempts>=2){login.setEnabled(false); Toast.makeText(this,"Failed Login Attempts",Toast.LENGTH_LONG).show();}
    else Toast.makeText(this,"Login Failed. Remaining attempts: "+(2-attempts),Toast.LENGTH_SHORT).show();
   }
  });
 }
}
