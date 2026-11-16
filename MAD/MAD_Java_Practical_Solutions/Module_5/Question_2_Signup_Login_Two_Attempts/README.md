# Module 5 – Question 2: Sign-up + login, password rules, two attempts and Bundle

## Password rules implemented
- At least 8 characters
- At least one uppercase letter
- At least one lowercase letter
- At least one digit
- At least one special character

## Files
- `SignupActivity.java`
- `LoginActivity.java`
- `SuccessActivity.java`
- `AndroidManifest.xml`

Copy each Java class into your app package. Add all three activities to the manifest. Signup passes username/password with Intent extras (`putExtra`/`getStringExtra`), which are backed by a Bundle. Login allows two failed attempts, then disables the Sign In button and shows “Failed Login Attempts”.

**Exam caveat:** This meets the syllabus exercise but passes the password in an Intent for demonstration only. A real app must not transmit/store plaintext passwords; authenticate securely through a backend.
