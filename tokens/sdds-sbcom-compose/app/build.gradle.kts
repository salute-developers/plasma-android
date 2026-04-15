@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    id("convention.auto-bump")
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.sdds.sbcom.compose.sandbox"
}

ksp {
    arg("sandbox.packageName", "com.sdds.sbcom.compose.sandbox.stories")
}

dependencies {
    implementation(project(":sdds-sbcom-compose:integration"))
    implementation(project(":sdds-sbcom-compose"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:uikit-compose-fixtures")
    ksp("integration-core:sandbox-ksp")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.koil.compose)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.activity)
    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    debugImplementation(libs.base.androidX.compose.uiTooling)
}
