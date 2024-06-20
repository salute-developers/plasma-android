@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.themes.themebuilder.sdds.serv.tokens"
}

themeBuilder {
    themeSource(name = "sdds_serv", version = "latest")
    compose(ktPackage = "com.sdds.themes.sdds.serv.tokens")
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    implementation("sdds-core:uikit-compose")
    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)
}
