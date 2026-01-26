@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
}

group = "sdds-core"

android {
    namespace = "com.sdds.compose.docs"
}

dependencies {
    implementation(project(":docs"))
    implementation(libs.base.androidX.compose.foundation)

    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)

}
