import utils.versionInfo

plugins {
    id("convention.android-app")
}

android {
    namespace = "com.sdds.sandbox"

    defaultConfig {
        applicationId = "com.sdds.sandbox"
    }
}

dependencies {
    implementation(project(":uikit"))
    implementation(project(":uikit-compose"))

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(composeBom)
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
}
