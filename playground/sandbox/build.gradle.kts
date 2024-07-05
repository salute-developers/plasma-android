import com.sdds.plugin.themebuilder.ThemeBuilderMode

plugins {
    id("convention.android-app")
    id("convention.compose")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.sandbox"

    defaultConfig {
        applicationId = "com.sdds.playground.sandbox"
    }
}

themeBuilder {
    themeSource(url = "file://${projectDir.path}/theme/sandbox_theme.zip")
    compose()
    ktPackage("com.sdds.playground.themebuilder.tokens")
    mode(ThemeBuilderMode.THEME)
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.compose.material)
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
