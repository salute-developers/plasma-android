import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.versionInfo

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.plasma.sd.service"
    resourcePrefix = "sd_service"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("plasma sd service version must be specified")
    themeSource(name = "plasma_b2c", version = themeVersion, alias = "PlasmaSdService")
    compose()
    ktPackage(ktPackage = "com.sdds.plasma.sd.service.tokens")
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
