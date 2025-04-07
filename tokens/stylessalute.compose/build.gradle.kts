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
    namespace = "com.sdds.stylessalute.compose"
    resourcePrefix = "salute_cmp"
}

themeBuilder {
    themeSource(name = "stylesSalute", version = themeVersion)
    componentSource(name = "stylesSalute", version = componentsVersion)
    compose()
    autoGenerate(false)
    ktPackage(ktPackage = "com.sdds.stylessalute")
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
