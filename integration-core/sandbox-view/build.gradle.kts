@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
}

group = "integration-core"

android {
    namespace = "com.sdds.view.sandbox"
}

dependencies {
    implementation(project(":sandbox-core"))
    implementation(project(":sandbox-compose"))
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.core)
    implementation(libs.sdds.uikit)
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
}
