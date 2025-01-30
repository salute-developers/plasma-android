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
    namespace = "com.sdds.plasma.sd.service.compose"
    resourcePrefix = "sd_service_cmp"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("plasma sd service version must be specified")
    themeSource(name = "plasma_b2c", version = themeVersion, alias = "PlasmaSdService")
    compose()
    ktPackage(ktPackage = "com.sdds.plasma.sd.service")
    mode(THEME)
    componentsSource("https://github.com/salute-developers/theme-converter/raw/main/components/sdds_serv")
    outputLocation(SRC)
    autoGenerate(false)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}