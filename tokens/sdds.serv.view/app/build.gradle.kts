@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.serv.sandbox"
}

dependencies {
    implementation(project(":sdds.serv.view:integration"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation("integration-core:uikit-fixtures")
    implementation(libs.sdds.uikit.compose)
}
