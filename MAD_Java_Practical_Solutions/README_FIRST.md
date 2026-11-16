# MCA301L – Mobile Application Development Lab (Java) – Complete Practical Solutions

Prepared from the Mobile Application Development Lab (MCA301L) practical questions in the supplied ICEM syllabus.

## Package structure
Each `Module_X/Question_Y_*` folder contains a focused solution note and, where applicable, Java and XML source files. The package covers all 21 listed practical questions across Modules 1–6.

## Environment assumed
- Android Studio (current stable)
- Java (Android project language set to Java)
- Android SDK / platform tools installed through SDK Manager
- Empty Views Activity (not Jetpack Compose)
- XML layouts in `app/src/main/res/layout/`
- Java classes in `app/src/main/java/<your_package>/`

Create a project once, then copy each question's Java/XML files into the corresponding locations. Replace the package declaration with your app's actual namespace. Add any manifest permissions shown in the question's README.

## Important compatibility and safety notes
1. `AbsoluteLayout` is deprecated and should not be used in a production app. The syllabus asks to demonstrate it; the solution explains the legacy concept and gives a responsive `FrameLayout` alternative.
2. Android does not allow ordinary third-party apps to silently switch Wi-Fi on/off on modern Android. The Wi-Fi solution opens the system Internet panel instead.
3. For Bluetooth, request user approval using `ACTION_REQUEST_ENABLE`; disabling Bluetooth directly is restricted on modern Android.
4. Phone-call practical uses `ACTION_DIAL`, which opens the dialer and does not require the dangerous `CALL_PHONE` permission.
5. Never store plain-text passwords in a real app. The SQLite example demonstrates local storage for the lab, with a clear warning; production authentication should use a secure backend and password hashing.
6. Google Maps requires a valid API key, billing-enabled Google Cloud project, and appropriate key restrictions. Never commit a real API key to a public repository.
7. Publishing requires a signed Android App Bundle (AAB), Play Console developer account, privacy policy/data safety declarations, and compliance with current Play policies. The map/bus practicals include app prototypes and deployment checklist, not an actual Play Store upload.

## How to build/run
- Open Android Studio → New Project → Empty Views Activity.
- Select Java as the language.
- Use the package's XML in `app/src/main/res/layout/activity_main.xml`.
- Put Java files in the matching package under `app/src/main/java/`.
- Ensure `setContentView(R.layout.activity_main)` is used in the Activity.
- Sync Gradle, build, and run on an emulator or physical Android device.
- For multi-activity questions, register activities in `AndroidManifest.xml`.

## Question index
- Module 1: Q1 Hello World
- Module 2: Q1 JDK/Android Studio/SDK setup; Q2 ADT/AVD (legacy ADT note + AVD setup)
- Module 3: Q1 Visiting card; Q2 Linear + Absolute/modern alternative; Q3 Frame + Table + Relative; Q4 Student form
- Module 4: Q1 Login validation; Q2 Visiting card; Q3 Calculator; Q4 Phone dialer Intent; Q5 Bluetooth; Q6 Wi-Fi
- Module 5: Q1 Basic sign-up validation; Q2 Sign-up/login with two attempts and Bundle; Q3 SQLite user database; Q4 Change screen color using menu; Q5 Text-to-Speech; Q6 SQLite Course CRUD
- Module 6: Q1 Map-based food delivery app; Q2 Bus ticket reservation app

## Exam strategy
For each practical, explain the objective, identify the controls/API used, show the Java event-handling logic, run the app, and demonstrate the expected output. For permission- or API-dependent tasks, explain the modern Android restriction and demonstrate the supported system UI.
