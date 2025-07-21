import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeName
import utils.themeResPrefix
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
    id("convention.docusaurus")
}

android {
    namespace = "com.sdds.plasma.sd.service"
    resourcePrefix = themeResPrefix
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    view {
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    ktPackage("com.sdds.plasma.sd.service")
    autoGenerate(false)
    mode(ThemeBuilderMode.THEME)
    outputLocation(OutputLocation.SRC)
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
