@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.integration-compose")
}

android {
    namespace = "com.sdds.playground.sandbox.sdds.sbcom.integration"
}

dependencies {
    implementation(project(":sandbox-core-integration"))
    implementation("tokens:sdds-sbcom-compose")
    implementation(libs.sdds.uikit.compose)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
}
