import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
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
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
    id("convention.docusaurus")
}

android {
    namespace = "com.sdds.serv"
    resourcePrefix = themeResPrefix
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    // componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    componentSource {
        url("file:///Users/alex/Projects/theme-converter/components/sdds_serv/0.8.0-rc.zip")
        name(themeAlias)
    }
    view{
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    ktPackage("com.sdds.serv")
    autoGenerate(false)
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
