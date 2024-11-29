@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.stylessalute"
    resourcePrefix = "styles"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "stylesSalute", version = themeVersion)
    view()
    ktPackage(ktPackage = "com.sdds.themes.stylessalute.tokens")
}

dependencies {
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
