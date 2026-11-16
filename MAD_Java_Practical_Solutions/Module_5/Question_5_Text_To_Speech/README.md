# Module 5 – Question 5: Convert Text to Speech

**Layout:** An EditText, a Button labelled “Convert Text to Speech”, and a TextView can be used. The Java below creates the controls programmatically and uses Android `TextToSpeech`.

```java
package com.example.madpracticals;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
 private TextToSpeech tts;
 private EditText input;
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout root=new LinearLayout(this); root.setOrientation(1); root.setPadding(20,20,20,20);
  input=new EditText(this); input.setHint("Enter text");
  Button speak=new Button(this); speak.setText("Convert Text to Speech");
  root.addView(input); root.addView(speak); setContentView(root);
  tts=new TextToSpeech(this,status -> { if(status==TextToSpeech.SUCCESS) tts.setLanguage(Locale.US); });
  speak.setOnClickListener(v -> {
   String text=input.getText().toString().trim();
   if(text.isEmpty()) Toast.makeText(this,"Enter text first",Toast.LENGTH_SHORT).show();
   else if(tts!=null) tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,"mad-tts");
  });
 }
 @Override protected void onDestroy(){ if(tts!=null){tts.stop();tts.shutdown();} super.onDestroy(); }
}
```
**Expected output:** The device speaks the entered text using its installed TTS engine. Internet is not necessarily required if the selected voice is installed offline.
