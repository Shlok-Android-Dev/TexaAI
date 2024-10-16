plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.textrecognizer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.textrecognizer"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

  /*      // For Text Recognition
        implementation("com.google.mlkit:text-recognition:16.0.1")
        // For Translation
        implementation("com.google.mlkit:translate:17.0.3")
        // For TTS
        implementation("androidx.textToSpeech:textToSpeech:1.0.0")
        // For Room Database
        implementation("androidx.room:room-runtime:2.6.1")

        //kapt("androidx.room:room-compiler:2.4.3")
        // For Coroutines
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
        // For Floating Button
        implementation("com.getkeepsafe.taptargetview:taptargetview:1.13.1")
*/
}