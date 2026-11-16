# Module 6 – Question 1: Map-based food delivery application

## Functional design
1. Show Google Map.
2. Ask user for location permission only when the feature is needed.
3. Display restaurant/delivery markers.
4. Show a route from restaurant to customer using Google Directions API (or Maps URLs for a simple demonstration).
5. Update delivery location periodically from a backend in a real implementation.
6. Publish a signed AAB through Play Console after policy checks.

## Minimal Maps Activity example
Add the Google Maps SDK dependency using the current official setup guide. Add a Maps API key through a secure local properties/secrets setup; do not commit it to Git.

```java
package com.example.madpracticals;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
 @Override protected void onCreate(Bundle b) {
  super.onCreate(b);
  // activity_maps.xml must contain a SupportMapFragment with id=map
  setContentView(R.layout.activity_maps);
  SupportMapFragment map=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
  if(map!=null) map.getMapAsync(this);
 }
 @Override public void onMapReady(@NonNull GoogleMap googleMap) {
  LatLng pune=new LatLng(18.5204,73.8567);
  googleMap.addMarker(new MarkerOptions().position(pune).title("Restaurant / Delivery Area"));
  googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pune,12f));
 }
}
```

`activity_maps.xml`:
```xml
<fragment xmlns:android="http://schemas.android.com/apk/res/android"
 xmlns:tools="http://schemas.android.com/tools"
 android:id="@+id/map" android:name="com.google.android.gms.maps.SupportMapFragment"
 android:layout_width="match_parent" android:layout_height="match_parent"
 tools:context=".MapsActivity"/>
```

## Location permission
Declare `ACCESS_FINE_LOCATION` / `ACCESS_COARSE_LOCATION` only if the app genuinely needs the device location, and request permission at runtime. Do not enable the blue-dot layer until permission is granted. For the marker-only demo above, no location permission is needed.

## Play Store deployment checklist
- Test on physical devices and different screen sizes.
- Configure API key restrictions and billing.
- Prepare app icon, screenshots, description and privacy policy.
- Build a signed Android App Bundle (AAB).
- Complete Data safety, content rating and target API requirements in Play Console.
- Upload to an internal testing track, test, then submit for review.

This is a working map screen foundation; live tracking and directions require a backend/location updates and a routing service. Do not claim real-time tracking from a static marker.
