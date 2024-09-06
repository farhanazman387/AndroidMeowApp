plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.meowapps"
    compileSdk = 34

    buildFeatures {

        compose = true

        viewBinding = true

    }



    composeOptions {

        kotlinCompilerExtensionVersion = "1.5.10"

    }

    defaultConfig {
        applicationId = "com.example.meowapps"
        minSdk = 21
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

    val composeBom = platform("androidx.compose:compose-bom:2024.02.02")

    implementation(composeBom)

    androidTestImplementation(composeBom)

    implementation("androidx.compose.material3:material3")

    // Android Studio Preview support

    implementation("androidx.compose.ui:ui-tooling-preview")

    debugImplementation("androidx.compose.ui:ui-tooling")

    // Optional - Integration with activities

    implementation("androidx.activity:activity-compose:1.8.2")

    // Optional - Integration with ViewModels

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")

    // Optional - Integration with LiveData

    implementation("androidx.compose.runtime:runtime-livedata")



    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.appcompat)

    implementation(libs.material)

    implementation(libs.androidx.activity)

    implementation(libs.androidx.constraintlayout)



    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.junit)

    androidTestImplementation(libs.androidx.espresso.core);



    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    implementation ("androidx.activity:activity-ktx:1.6.1")
}