@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.plasma.homeds.sandbox"
}

dependencies {
    implementation(project(":plasma.giga.compose:integration"))
    implementation(project(":plasma.giga.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("sdds-core:uikit-compose-fixtures")
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.activity)
}
