# Manifest and resource reminders

- Normal single-activity practicals need only the generated manifest.
- For Module 5 Q2 add SignupActivity, LoginActivity and SuccessActivity as shown in that folder's manifest.
- Maps requires a Google Maps API key in the application metadata, configured according to the current Google Maps SDK setup guide. Keep secrets out of source control.
- `ACTION_DIAL` needs no `CALL_PHONE` permission.
- Bluetooth permissions depend on the operations and target SDK; the sample uses the system enable-consent intent.
- Wi-Fi settings panel needs no Wi-Fi toggle permission.
- Text-to-Speech typically needs no dangerous runtime permission.
