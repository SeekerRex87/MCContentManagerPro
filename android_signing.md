# Podpisywanie APK — SeekerRex87

## Generowanie klucza (JDK `keytool`)
```bash
keytool -genkeypair -v -keystore release.keystore -alias seekerrex87 -keyalg RSA -keysize 4096 -validity 10000   -dname "CN=SeekerRex87, OU=Dev, O=GitHub, L=, ST=, C=NL"
```
Utworzony plik `release.keystore` trzymaj poza repozytorium. Dane wpisz do `keystore.properties`.

## Konfiguracja Gradle (`app/build.gradle`)
```gradle
android {
    defaultConfig {
        applicationId "com.github.seekerrex87.minecrafteditor"
        // ...
    }

    buildTypes {
        release {
            minifyEnabled false
            signingConfig signingConfigs.release
        }
        debug {
            signingConfig signingConfigs.release // opcjonalnie
        }
    }

    signingConfigs {
        release {
            def props = new Properties()
            def f = rootProject.file("keystore.properties")
            if (f.exists()) {
                props.load(new FileInputStream(f))
                storeFile file(props['storeFile'])
                storePassword props['storePassword']
                keyAlias props['keyAlias']
                keyPassword props['keyPassword']
                enableV1Signing true
                enableV2Signing true
            }
        }
    }
}
android.buildFeatures.buildConfig true

// Autor w BuildConfig
android {
    defaultConfig {
        buildConfigField "String", "AUTHOR", ""SeekerRex87""
    }
}
```

## Ręczne podpisanie (jeśli nie używasz signingConfigs)
```bash
./gradlew assembleRelease
# wynik: app-release-unsigned.apk
zipalign -v -p 4 app/build/outputs/apk/release/app-release-unsigned.apk app-release-aligned.apk
apksigner sign --ks release.keystore --ks-key-alias seekerrex87 app-release-aligned.apk
apksigner verify --verbose app-release-aligned.apk
```
