@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
    alias(libs.plugins.paparazzi)
    alias(libs.plugins.binary.compatibility.validator)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit"
}

dependencies {

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.base.androidX.constraintlayout.compose)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)

}
