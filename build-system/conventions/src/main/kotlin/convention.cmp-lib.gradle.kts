import tasks.IOS_SCREENSHOT_DIFF_THRESHOLD
import tasks.VerifyRoborazziIosThresholdTask
import utils.configureAndroidLibraryDefaults

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

configureAndroidLibraryDefaults()

pluginManager.withPlugin("io.github.takahirom.roborazzi") {
    tasks.register<VerifyRoborazziIosThresholdTask>("verifyRoborazziIosWithThreshold") {
        group = "verification"
        description = "Verifies iOS Roborazzi results with a temporary diff threshold"
        dependsOn("compareRoborazziIosSimulatorArm64")
        resultsDirectory.set(layout.buildDirectory.dir("test-results/roborazzi/results"))
        threshold.set(IOS_SCREENSHOT_DIFF_THRESHOLD)
    }
}

android {

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
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
