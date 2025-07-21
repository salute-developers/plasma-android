import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeName
import utils.themeResPrefix
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
    id("convention.docusaurus")
}

android {
    namespace = "com.sdds.plasma.sd.service.compose"
    resourcePrefix = themeResPrefix
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
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
