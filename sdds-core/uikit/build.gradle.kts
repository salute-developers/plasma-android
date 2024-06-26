@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    alias(libs.plugins.paparazzi)
    alias(libs.plugins.binary.compatibility.validator)
}

group = "sdds-core"

android {
    namespace = "com.sdds.uikit"
    resourcePrefix = "sd_"
}

dependencies {
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.androidX.core)
    implementation(libs.base.android.material)
    androidTestImplementation(libs.base.test.ui.espresso.core)
}
