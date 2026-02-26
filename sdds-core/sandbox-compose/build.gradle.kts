@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.sandbox"
}

dependencies {

    implementation(project(":sandbox-core"))
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)
    implementation(libs.base.androidX.navigation.compose)


    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

}
