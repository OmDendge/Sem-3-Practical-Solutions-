package com.example.madpracticals;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b); setContentView(R.layout.activity_main);
  EditText a=findViewById(R.id.num1), c=findViewById(R.id.num2);
  TextView out=findViewById(R.id.result);
  int[] ids={R.id.add,R.id.sub,R.id.mul,R.id.div};
  for(int id:ids) findViewById(id).setOnClickListener(v -> {
   String x=a.getText().toString().trim(), y=c.getText().toString().trim();
   if(x.isEmpty()||y.isEmpty()){out.setText("Enter both numbers");return;}
   double n1=Double.parseDouble(x), n2=Double.parseDouble(y), ans;
   if(id==R.id.add) ans=n1+n2;
   else if(id==R.id.sub) ans=n1-n2;
   else if(id==R.id.mul) ans=n1*n2;
   else {if(n2==0){out.setText("Cannot divide by zero");return;} ans=n1/n2;}
   out.setText("Result: "+ans);
  });
 }
}
