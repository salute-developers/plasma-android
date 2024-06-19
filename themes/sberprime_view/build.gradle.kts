@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
}

themeBuilder {
    themeSource(name = "sberprime", version = "latest")
    view(parentThemeName = "Sdds.Theme")
    resourcesPrefix(prefix = "thmbldr")
}

dependencies {
    implementation("sdds-core:uikit")
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
