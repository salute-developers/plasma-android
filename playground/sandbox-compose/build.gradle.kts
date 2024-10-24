import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id("convention.compose")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.playground.sandbox"

    defaultConfig {
        applicationId = "com.sdds.playground.sandbox.compose"
    }
    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
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

themeBuilder {
    themeSource(name = "sdds_serv", version = "latest")
    compose()
    ktPackage("com.sdds.playground.sandbox.tokens")
    mode(ThemeBuilderMode.THEME)
}

dependencies {
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.material)
    implementation(libs.base.androidX.compose.animation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)
    implementation(libs.base.koil.compose)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

    // UI Tests
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
    testImplementation(libs.base.test.ui.compose.jUnit4)

    //Screenshot tests
    testImplementation(libs.test.roborazzi)
    testImplementation(libs.test.roborazzi.compose)
    testImplementation(libs.test.roborazzi.rule)
    testImplementation(libs.base.test.unit.robolectric)
}
