@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-view")
}

android {
    namespace = "com.sdds.sd.service.sandbox.integration"
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation(project(":plasma.sd.service.view"))
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
