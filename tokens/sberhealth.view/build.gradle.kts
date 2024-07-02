@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.themes.sberhealth.tokens"
}

themeBuilder {
    themeSource(name = "sberHealth", version = "latest")
    view()
    ktPackage(ktPackage = "com.sdds.themes.sberhealth.tokens")
    resourcesPrefix(prefix = "sdgen")
}

dependencies {
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
