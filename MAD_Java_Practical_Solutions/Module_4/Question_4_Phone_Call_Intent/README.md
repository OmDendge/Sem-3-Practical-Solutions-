# Module 4 – Question 4: Make a phone call using Intent

Use `ACTION_DIAL` so the user reviews and taps Call in the system dialer. This is safer and requires no `CALL_PHONE` permission.

```java
package com.example.madpracticals;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  Intent dial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9876543210"));
  startActivity(dial);
 }
}
```

**Expected output:** Android Phone app opens with the number filled in.

`ACTION_CALL` places a call directly and requires runtime `CALL_PHONE` permission; it is not necessary for this practical and should not be used without explicit user consent.
