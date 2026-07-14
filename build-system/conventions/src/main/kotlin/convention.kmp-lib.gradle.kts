import utils.configureAndroidLibraryDefaults

plugins {
    id("com.android.library")
    id("org.gradle.android.cache-fix")
    id("convention.kotlin-java-version-sync")
    kotlin("multiplatform")
    id("convention.detekt")
    id("convention.spotless")
}

configureAndroidLibraryDefaults()

android {

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    lint {
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}
