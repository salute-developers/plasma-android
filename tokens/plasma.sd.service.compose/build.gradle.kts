import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.componentsVersion
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing-compose")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.sd.service.compose"
    resourcePrefix = "sd_service_cmp"
}

themeBuilder {
    themeSource(name = "plasma_b2c", version = themeVersion, alias = "PlasmaSdService")
    componentSource(name = "plasma_b2c", version = componentsVersion, alias = "PlasmaSdService")
    compose()
    ktPackage(ktPackage = "com.sdds.plasma.sd.service")
    mode(THEME)
    outputLocation(SRC)
    autoGenerate(false)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
