@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.themes.sdds.serv.tokens"
}

themeBuilder {
    themeSource(name = "sdds_serv", version = "latest")
    compose(ktPackage = "com.sdds.themes.sdds.serv.tokens")
    resourcesPrefix(prefix = "sdgen")
}

dependencies {
    
    implementation(libs.base.androidX.compose.foundation)
}
