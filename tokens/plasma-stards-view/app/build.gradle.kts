@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdkit.star.designsystem.sandbox"
}

dependencies {
    implementation(project(":plasma-stards-view:integration"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation("sdds-core:uikit-fixtures")
    implementation(libs.sdds.uikit.compose)
}
