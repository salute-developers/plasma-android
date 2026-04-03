@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.auto-bump")
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.plasma.sd.service.sandbox"
}

dependencies {
    implementation(project(":plasma.sd.service.view:integration"))
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation("integration-core:uikit-fixtures")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.activity)
}
