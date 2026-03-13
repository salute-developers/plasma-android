@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.plasma.homeds.sandbox"
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("sdds-core:uikit-compose-fixtures")
}
