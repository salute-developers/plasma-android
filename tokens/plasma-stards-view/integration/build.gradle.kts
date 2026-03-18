@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.integration-view")
}

android {
    namespace = "com.sdkit.star.designsystem.integration"
}

dependencies {
    implementation("integration-core:sandbox-core")
    implementation("integration-core:sandbox-compose")
    implementation("integration-core:sandbox-view")
    implementation(project(":plasma-stards-view"))
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
