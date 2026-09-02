@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
    id("com.android.test")
    id("convention.performance-benchmark")
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.playground.macrobenchmark"
    compileSdk = libs.versions.global.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.global.minSdk.get().toInt()
        targetSdk = libs.versions.global.targetSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    targetProjectPath = ":sandbox-integration-test"
    experimentalProperties["android.experimental.self-instrumenting"] = true

    buildTypes {
        create("benchmark") {
            isDebuggable = true
            signingConfig = signingConfigs.getByName("debug")
            matchingFallbacks += "release"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = libs.versions.global.jvmTarget.get()
    }
}

dependencies {
    implementation(libs.base.test.benchmark.macro.jUnit4)
    implementation(libs.base.test.benchmark.jUnit)
    implementation(libs.base.test.benchmark.uiAutomator)
}
