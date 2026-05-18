@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.sandbox-app")
    id("convention.compose")
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.sdds.playground.integrationtest"
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation("io.github.salute-developers:sdds-serv-compose:+")
    implementation("sdds-core:uikit-compose")
    implementation("sdds-core:icons")
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.constraintLayout)
    androidTestImplementation(libs.base.test.integration.jUnit)
    androidTestImplementation(libs.base.test.ui.espresso.core)
    androidTestImplementation(libs.base.test.ui.compose.jUnit4)
    androidTestImplementation(libs.base.test.integration.rules)
    androidTestImplementation(libs.base.test.integration.runner)
    androidTestImplementation(platform(libs.base.androidX.compose.bom))

    debugImplementation(platform(libs.base.androidX.compose.bom))
    debugImplementation(libs.base.test.ui.compose.uiTestManifest)

}
