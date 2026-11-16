package com.example.madpracticals;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText name, pass, address, age; RadioGroup gender; Spinner state; TextView result;
    String dob = "Not selected";
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_main);
        name=findViewById(R.id.name); pass=findViewById(R.id.pass);
        address=findViewById(R.id.address); age=findViewById(R.id.age);
        gender=findViewById(R.id.gender); state=findViewById(R.id.state);
        result=findViewById(R.id.result);
        String[] states={"Maharashtra","Goa","Karnataka","Gujarat","Madhya Pradesh"};
        state.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, states));
        findViewById(R.id.dob).setOnClickListener(v -> {
            Calendar c=Calendar.getInstance();
            new DatePickerDialog(this,(view,y,m,d)->dob=d+"/"+(m+1)+"/"+y,
                c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
        });
        findViewById(R.id.submit).setOnClickListener(v -> {
            int selected=gender.getCheckedRadioButtonId();
            String g=selected==-1 ? "Not selected" : ((RadioButton)findViewById(selected)).getText().toString();
            String a=age.getText().toString().trim();
            if(name.getText().toString().trim().isEmpty() || a.isEmpty()) {
                Toast.makeText(this,"Enter name and age",Toast.LENGTH_SHORT).show(); return;
            }
            result.setText("Name: "+name.getText()+"\nAddress: "+address.getText()+
                "\nGender: "+g+"\nAge: "+a+"\nDOB: "+dob+"\nState: "+state.getSelectedItem());
        });
    }
}
