@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.themes.themebuilder.sbermarket.tokens"
}

themeBuilder {
    themeSource(name = "sbermarket", version = "latest")
    view(parentThemeName = "Sdds.Theme")
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    implementation("sdds-core:uikit")
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
