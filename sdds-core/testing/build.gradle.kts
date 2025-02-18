plugins {
    id("convention.android-lib")
    id("kotlin-parcelize")
    id("convention.compose")
}

group = "sdds-core"

android {
    namespace = "com.sdds.testing"
    buildFeatures {
        viewBinding = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(project(":uikit"))
    implementation(project(":icons"))
    implementation(project(":uikit-compose"))
    implementation(libs.base.glide)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.test.unit.jUnit)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.test.ui.compose.jUnit4)
    implementation(libs.test.roborazzi.compose)
    implementation(libs.base.androidX.compose.uiTooling.preview)
    implementation(libs.base.androidX.compose.foundation)
}
