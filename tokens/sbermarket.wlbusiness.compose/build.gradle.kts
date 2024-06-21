@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.themes.sbermarket.wlbusiness.tokens"
}

themeBuilder {
    themeSource(name = "sbermarket_wlbusiness", version = "latest")
    compose(ktPackage = "com.sdds.themes.sbermarket.wlbusiness.tokens")
    resourcesPrefix(prefix = "sdgen")
}

dependencies {
    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)
}
