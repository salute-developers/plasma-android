import utils.withVersionCatalogs

plugins {
    id("com.android.library")
    id("org.gradle.android.cache-fix")
    id("convention.kotlin-java-version-sync")
    id("org.jetbrains.kotlin.plugin.compose")
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

        buildFeatures {
            compose = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    withVersionCatalogs {
        compileOptions {
            sourceCompatibility = JavaVersion.toVersion(versions.global.jvmTarget.get())
            targetCompatibility = JavaVersion.toVersion(versions.global.jvmTarget.get())
        }
    }

    lint {
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}
