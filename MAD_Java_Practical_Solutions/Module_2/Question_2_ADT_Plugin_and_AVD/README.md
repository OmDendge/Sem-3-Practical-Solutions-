# Module 2 – Question 2: Configure ADT plug-in and create AVD

## Important correction
ADT (Android Development Tools) was the old Eclipse plug-in and is discontinued. Current Android development uses Android Studio, which includes the Android Gradle plugin and Android tooling. Do not install an old ADT plug-in into modern Android Studio.

## Create an Android Virtual Device (AVD)
1. Open Android Studio → Tools → Device Manager.
2. Select **Create Device**.
3. Choose a device profile (for example, Pixel) → Next.
4. Select/download a system image compatible with the installed SDK.
5. Finish; the AVD appears in Device Manager.
6. Press the Play icon to launch the emulator.
7. Run an Android project and select this emulator as the deployment target.

## Legacy ADT (if specifically required for theory)
ADT was installed into Eclipse through Help → Install New Software using the historical Android ADT update site. This legacy setup is obsolete and should only be described, not used for a current practical.

## Verification
The emulator boots, displays the Android home screen, and appears in Android Studio's device selector.
