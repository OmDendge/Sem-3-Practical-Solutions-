# Module 4 – Question 5: Turn Bluetooth ON/OFF

Modern Android requires user consent for enabling Bluetooth. Apps targeting Android 13+ can use `BluetoothAdapter.ACTION_REQUEST_ENABLE` to ask the user. Silently toggling Bluetooth is restricted; do not use hidden APIs.

```java
package com.example.madpracticals;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 private ActivityResultLauncher<Intent> enableBt;
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  Button button = new Button(this); button.setText("Enable Bluetooth"); setContentView(button);
  enableBt = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {});
  button.setOnClickListener(v -> {
   Intent request = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
   enableBt.launch(request);
  });
 }
}
```

**Disable Bluetooth:** Direct programmatic disabling is restricted for ordinary apps. The user can disable it from Quick Settings or system Settings. Explain this restriction in the practical viva.

For Android 12+ apps that inspect/connect to nearby devices, declare and request the appropriate `BLUETOOTH_CONNECT` / `BLUETOOTH_SCAN` runtime permissions. The minimal enable request above delegates the consent screen to Android.
