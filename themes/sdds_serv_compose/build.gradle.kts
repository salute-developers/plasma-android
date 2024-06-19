@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
}

themeBuilder {
    themeSource(name = "sdds_serv", version = "latest")
    compose(ktPackage = "com.sdds.themes.sdds_serv.tokens")
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    implementation("sdds-core:uikit-compose")
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)
}
