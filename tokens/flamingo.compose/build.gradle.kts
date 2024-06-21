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
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)
}
