import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.plasma.b2c"
    resourcePrefix = "b2c"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("plasma_b2c version must be specified")
    themeSource(name = "plasma_b2c", version = themeVersion)
    compose()
    ktPackage(ktPackage = "com.sdds.plasma.b2c.tokens")
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation("sdds-core:uikit-compose")
    implementation(libs.base.androidX.compose.foundation)
}
