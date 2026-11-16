# Module 6 – Question 2: Bus ticket reservation application

## Features
- Select source/destination route.
- Choose number of tickets.
- Calculate total fare.
- Confirm booking and display booking summary.
- A production system must check seat availability and create the booking on a backend transactionally.

## Java prototype (single Activity)
```java
package com.example.madpracticals;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout root=new LinearLayout(this);root.setOrientation(1);root.setPadding(20,20,20,20);
  TextView title=new TextView(this);title.setText("Bus Ticket Reservation");title.setTextSize(24);
  Spinner route=new Spinner(this);
  String[] routes={"Pune → Mumbai","Pune → Nashik","Pune → Kolhapur"};
  route.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,routes));
  EditText count=new EditText(this);count.setHint("Number of tickets");count.setInputType(2);
  TextView result=new TextView(this);Button book=new Button(this);book.setText("Book Tickets");
  root.addView(title);root.addView(route);root.addView(count);root.addView(book);root.addView(result);setContentView(root);
  book.setOnClickListener(v->{
   String s=count.getText().toString().trim();
   if(s.isEmpty() || Integer.parseInt(s)<1 || Integer.parseInt(s)>6){
    Toast.makeText(this,"Enter 1 to 6 tickets",Toast.LENGTH_SHORT).show();return;
   }
   int tickets=Integer.parseInt(s), fare=500;
   result.setText("Booking Confirmed (Demo)\nRoute: "+route.getSelectedItem()+
      "\nTickets: "+tickets+"\nTotal: ₹"+(tickets*fare));
  });
 }
}
```

## Expected output
A route and ticket count can be selected; the app calculates fare at ₹500 per ticket and displays a demo confirmation.

## Production requirements
Use backend APIs, authentication, seat inventory locking, payment gateway integration, booking ID generation, cancellation/refund handling and secure storage. Never treat this local demo as a real ticket purchase.

## Publishing
Follow the same signed AAB, testing, privacy policy, Data safety and Play Console review steps described in Module 6 Question 1.
