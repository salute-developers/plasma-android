import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import utils.versionInfo
import utils.withVersionCatalogs

plugins {
    id("com.android.application")
    id("org.gradle.android.cache-fix")
    kotlin("android")
    id("convention.detekt")
    id("convention.spotless")
    id("convention.kotlin-java-version-sync")
    id("convention.compose")
}

android {
    val vInfo = versionInfo()
    withVersionCatalogs {
        compileSdk = versions.global.compileSdk.get().toInt()

        defaultConfig {
            resourceConfigurations += setOf("en", "ru")
            minSdk = versions.global.minSdk.get().toInt()
            targetSdk = versions.global.targetSdk.get().toInt()
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            versionCode = vInfo.code
            versionName = vInfo.name
            versionNameSuffix = vInfo.nameSuffix

        }

        kotlinOptions.jvmTarget = versions.global.jvmTarget.get()
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        disable += "NotificationPermission"
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }
    kotlinOptions {
        //comment following lines (freeCompilerArgs) to disable compose-metrics
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
        )
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination=" + project.buildDir.absolutePath + "/compose_metrics"
        )
    }

    signingConfigs {
        create("release") {
            if (System.getenv("KEY_STORE_FILE") != null) {
                storeFile = file(System.getenv("KEY_STORE_FILE"))
                storePassword = System.getenv("RELEASE_STORE_PASSWORD")
                keyAlias = System.getenv("RELEASE_KEY_ALIAS")
                keyPassword = System.getenv("RELEASE_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            if (System.getenv("KEY_STORE_FILE") != null) {
                signingConfig = signingConfigs.getByName("release")
            }
            isShrinkResources = true
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

val APP_DISTRIBUTION_NAME = "sandbox-compose-app-release"

tasks.register("generateVersionDescription") {
    group = "build"
    description = "Generates versions.json with versionCodes for both release variants"

    val outputFile = file("$buildDir/outputs/versions.json")
    doLast {
        val version = versionInfo()
        val json = buildJsonObject {
            val versionObj = buildJsonObject {
                put("code", version.code)
                put("name", version.name)
            }
            put(APP_DISTRIBUTION_NAME, versionObj)
        }
        outputFile.writeText(json.toString())
    }
}


dependencies {
    withVersionCatalogs {
        implementation(base.kotlin.stdlib)
        implementation(base.androidX.core)
        implementation(base.androidX.appcompat)
        implementation(base.androidX.activity.compose)

        testImplementation(base.test.unit.jUnit)
        testImplementation(base.test.unit.mockk)
        testImplementation(base.test.unit.robolectric)
    }
}
