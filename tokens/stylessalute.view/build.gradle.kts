import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.componentsVersion
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)}

android {
    namespace = "com.sdds.stylessalute"
    resourcePrefix = "salute"
}

themeBuilder {
    themeSource(name = "stylesSalute", version = themeVersion, alias = "StylesSalute")
//    componentSource(name = "stylesSalute", version = componentsVersion, alias = "StylesSalute")
    componentSource {
        url("file:///Users/alex/Projects/theme-converter/components/stylesSalute/0.5.0-rc.zip")
        name("StylesSalute")
    }
    autoGenerate(false)
    ktPackage("com.sdds.stylessalute")
    mode(THEME)
    outputLocation(SRC)
    view {
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
