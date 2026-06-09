plugins {
alias(libs.plugins.android.application)
alias(libs.plugins.kotlin.android)
alias(libs.plugins.google.devtools.ksp)
alias(libs.plugins.secrets)
}

android {
namespace = "com.aistudio.lensorastudio.xkydq"

compileSdk = 35

defaultConfig {
    applicationId = "com.aistudio.lensorastudio.xkydq"
    minSdk = 26
    targetSdk = 35
    versionCode = 1
    versionName = "1.0.0"

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

    debug {
        isMinifyEnabled = false
    }
}

compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlinOptions {
    jvmTarget = "17"
}

buildFeatures {
    compose = true
    buildConfig = true
}

composeOptions {
    kotlinCompilerExtensionVersion = "1.5.14"
}

testOptions {
    unitTests {
        isIncludeAndroidResources = true
    }
}

}

secrets {
propertiesFileName = ".env"
defaultPropertiesFileName = ".env.example"
}
