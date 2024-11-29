@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.stylessalute.compose"
    resourcePrefix = "styles_cmp"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "stylesSalute", version = themeVersion)
    compose()
    ktPackage(ktPackage = "com.sdds.stylessalute.tokens")
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
