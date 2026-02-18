@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
    id("convention.dokka")
    alias(libs.plugins.paparazzi)
    alias(libs.plugins.binary.compatibility.validator)
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.uikit"

    kotlinOptions {
        //comment following lines (freeCompilerArgs) to disable compose-metrics
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics")
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination="  + project.buildDir.absolutePath + "/compose_metrics")
    }
}

dependencies {

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.sdds.haze)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)

}
