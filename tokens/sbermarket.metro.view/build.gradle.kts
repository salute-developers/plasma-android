@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.themes.sbermarket.metro.tokens"
}

themeBuilder {
    themeSource(name = "sbermarket_metro", version = "latest")
    view()
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
