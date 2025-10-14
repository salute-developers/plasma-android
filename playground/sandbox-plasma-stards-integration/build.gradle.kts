@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.integration-compose")
    id("convention.integration-view")
}

android {
    namespace = "com.sdds.playground.sandbox.plasma.stards.integration"
}

dependencies {
    implementation(project(":sandbox-core-integration"))
    implementation("tokens:plasma-stards-compose")
    implementation("tokens:plasma-stards-view")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.android.material)
}
