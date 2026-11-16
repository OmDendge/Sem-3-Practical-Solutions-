# Module 4 – Question 6: Turn Wi-Fi ON/OFF

**Important Android platform rule:** Since Android 10 (API 29), ordinary apps cannot directly enable or disable Wi-Fi using `WifiManager.setWifiEnabled()`. That API is deprecated and restricted for normal apps. Use the system Internet panel so the user controls the switch.

```java
package com.example.madpracticals;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  Button button = new Button(this); button.setText("Open Wi-Fi / Internet Settings");
  setContentView(button);
  button.setOnClickListener(v -> {
   if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
    startActivity(new Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY));
   } else {
    startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
   }
  });
 }
}
```

**Expected output:** Android's Internet connectivity panel or Wi-Fi settings opens; user can turn Wi-Fi on/off. Do not claim the app silently changed the setting.
