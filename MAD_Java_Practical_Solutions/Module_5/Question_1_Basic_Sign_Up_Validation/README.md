# Module 5 – Question 1: Sign-up with username and password validation

This basic version checks that username and password are not blank and that the password has at least 8 characters. It then displays a success Toast.

```java
package com.example.madpracticals;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout root=new LinearLayout(this); root.setOrientation(LinearLayout.VERTICAL); root.setPadding(24,24,24,24);
  EditText username=new EditText(this); username.setHint("Username");
  EditText password=new EditText(this); password.setHint("Password"); password.setInputType(129);
  Button signup=new Button(this); signup.setText("Sign Up");
  root.addView(username); root.addView(password); root.addView(signup); setContentView(root);
  signup.setOnClickListener(v -> {
   String u=username.getText().toString().trim(), p=password.getText().toString();
   if(u.isEmpty() || p.length()<8) Toast.makeText(this,"Enter username and password (minimum 8 characters)",Toast.LENGTH_LONG).show();
   else Toast.makeText(this,"Sign-up validation successful",Toast.LENGTH_SHORT).show();
  });
 }
}
```

**Note:** This is a validation demonstration, not secure account creation. Do not save the password in plain text.
