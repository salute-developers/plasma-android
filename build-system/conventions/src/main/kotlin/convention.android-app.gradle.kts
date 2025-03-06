import com.android.build.gradle.internal.api.BaseVariantOutputImpl
import utils.versionInfo
import utils.withVersionCatalogs

plugins {
    id("com.android.application")
    id("org.gradle.android.cache-fix")
    kotlin("android")
    id("convention.detekt")
    id("convention.spotless")
    id("convention.kotlin-java-version-sync")
}

android {
    val vInfo = versionInfo()
    withVersionCatalogs {
        compileSdk = versions.global.compileSdk.get().toInt()

        defaultConfig {
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
        xmlReport = false
        textReport = false
        sarifReport = false
        htmlReport = true
    }
}

dependencies {
    withVersionCatalogs {
        implementation(base.kotlin.stdlib)
        testImplementation(base.test.unit.jUnit)
        testImplementation(base.test.unit.mockk)
        testImplementation(base.test.unit.robolectric)
    }
}
