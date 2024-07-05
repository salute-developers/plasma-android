@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.themes.sbermarket.selgros.tokens"
}

themeBuilder {
    themeSource(name = "sbermarket_selgros", version = "latest")
    compose()
    ktPackage(ktPackage = "com.sdds.themes.sbermarket.selgros.tokens")
    resourcesPrefix(prefix = "sdgen")
}

dependencies {
    implementation(libs.base.androidX.compose.foundation)
}
