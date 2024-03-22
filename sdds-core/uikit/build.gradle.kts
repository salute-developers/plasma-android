@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    alias(libs.plugins.paparazzi)
}

group = "sdds-core"

android {
    namespace = "com.sdds.uikit"
}

dependencies {
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    androidTestImplementation(libs.base.test.ui.espresso.core)
}
