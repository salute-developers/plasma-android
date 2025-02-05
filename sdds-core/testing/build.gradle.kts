plugins {
    id("convention.android-lib")
}

group = "sdds-core"

android {
    namespace = "com.sdds.testing"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    testImplementation(libs.base.test.unit.jUnit)
    implementation(libs.base.test.unit.jUnit)
    implementation(libs.test.roborazzi)
    implementation(libs.test.roborazzi.rule)
    implementation(libs.base.test.unit.robolectric)
    implementation(libs.base.test.ui.compose.jUnit4)
    implementation(libs.test.roborazzi.compose)
    implementation(libs.base.androidX.compose.uiTooling.preview)
    implementation(libs.base.androidX.compose.foundation)
    implementation(project(":uikit"))
}
