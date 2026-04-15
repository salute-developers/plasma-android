@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.plasma.homeds.sandbox"
}

dependencies {
    implementation(project(":plasma.homeds.compose:integration"))
    implementation(project(":plasma.homeds.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:uikit-compose-fixtures")
    implementation(libs.base.androidX.compose.foundation)
}
