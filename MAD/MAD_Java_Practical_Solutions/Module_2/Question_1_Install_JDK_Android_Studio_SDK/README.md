# Module 2 – Question 1: Install and configure JDK, Android Studio and Android SDK

## Procedure
1. Install a supported JDK (Android Studio bundles a compatible JetBrains Runtime; use the bundled runtime unless your course specifically requires a separate JDK).
2. Download and install Android Studio from the official Android Developers website.
3. Start Android Studio → More Actions → SDK Manager.
4. In **SDK Platforms**, install a current Android platform (and the platform version required by your lab).
5. In **SDK Tools**, install Android SDK Build-Tools, Android SDK Platform-Tools, Android SDK Command-line Tools and Android Emulator.
6. Accept licences and allow downloads to finish.
7. Create New Project → Empty Views Activity → choose Java.
8. Build/Run. Confirm Gradle sync succeeds and an emulator/device launches.

## Verification
In Android Studio Terminal:
```bash
adb version
```
To inspect installed SDK path, open SDK Manager → Android SDK Location. On Windows it is commonly under `%LOCALAPPDATA%\Android\Sdk`, but use the path shown in your installation.

## Viva points
- JDK provides Java compiler/runtime tools.
- Android SDK provides platform APIs, build tools and debugging tools.
- Android Studio is the IDE.
- Gradle automates building and dependency management.
- An emulator simulates an Android device.
