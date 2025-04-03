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
    namespace = "com.sdds.plasma.giga.app.compose"
    resourcePrefix = "giga_app_cmp"
}

themeBuilder {
    themeSource(name = "plasma_giga_app", version = themeVersion, alias = "PlasmaGigaApp")
    componentSource(name = "plasma_giga_app", version = componentsVersion, alias = "PlasmaGigaApp")
    compose()
    ktPackage(ktPackage = "com.sdds.plasma.giga.app")
    mode(THEME)
    outputLocation(SRC)
    autoGenerate(false)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
