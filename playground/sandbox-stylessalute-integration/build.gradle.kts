@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
}

android {
    namespace = "com.sdds.playground.sandbox.stylessalute.integration"
}

dependencies {
    implementation(project(":sandbox-core-integration"))
    implementation("tokens:stylessalute.compose")
    implementation("tokens:stylessalute.view")
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.android.material)
}
