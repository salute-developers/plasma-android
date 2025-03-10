@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("kotlin-parcelize")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.sdds.playground.sandbox.core.integration"
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.uikit)

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.android.material)
    implementation(libs.base.kotlin.serialization.json)
}
