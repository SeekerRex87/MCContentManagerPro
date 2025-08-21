plugins { id("com.android.application") }

android {
    namespace = "com.seekerrex87.mccontentmanagerpro"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.seekerrex87.mccontentmanagerpro"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
}
