@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdkit.star.designsystem.compose.sandbox"
}

dependencies {
    implementation(project(":plasma-stards-compose:integration"))
    implementation(project(":plasma-stards-compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("sdds-core:uikit-compose-fixtures")
    implementation(libs.base.androidX.compose.foundation)
}
