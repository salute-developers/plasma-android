@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sdds.plasma.homeds.sandbox"
}

ksp {
    arg("sandbox.packageName", "com.sdds.plasma.homeds.compose.sandbox.stories")
}

dependencies {
    implementation(project(":plasma.homeds.compose:integration"))
    implementation(project(":plasma.homeds.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:uikit-compose-fixtures")
    ksp("integration-core:sandbox-ksp")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)
}
