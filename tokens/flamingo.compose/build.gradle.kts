@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.themes.flamingo.tokens"
}

themeBuilder {
    themeSource(name = "flamingo", version = "latest")
    compose(ktPackage = "com.sdds.themes.flamingo.tokens")
    resourcesPrefix(prefix = "sdgen")
}

dependencies {
    
    implementation(libs.base.androidX.compose.foundation)
}
