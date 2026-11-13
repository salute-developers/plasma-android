@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sdds.plasma.giga.sandbox"
}

ksp {
    arg("sandbox.packageName", "com.sdds.plasma.giga.compose.sandbox.stories")
}

dependencies {
    implementation(project(":plasma.giga.compose:integration"))
    implementation(project(":plasma.giga.compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:uikit-compose-fixtures")
    ksp("integration-core:sandbox-ksp")
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.activity)
}
