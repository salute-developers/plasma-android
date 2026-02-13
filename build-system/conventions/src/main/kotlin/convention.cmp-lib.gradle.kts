import utils.withVersionCatalogs

plugins {
    id("com.android.library")
    id("org.gradle.android.cache-fix")
    id("convention.kotlin-java-version-sync")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id("convention.detekt")
    id("convention.spotless")
}

android {

    withVersionCatalogs {
        compileSdk = versions.global.compileSdk.get().toInt()

        defaultConfig {
            minSdk = versions.global.minSdk.get().toInt()
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}