import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import utils.componentsVersion
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.sd.service"
    resourcePrefix = "plasma"
}

themeBuilder {
    themeSource(name = "plasma_b2c", version = themeVersion, alias = "SdService")
//    componentSource(name = "plasma_b2c", version = componentsVersion, alias = "SdService")
    componentSource {
        url("file:///Users/alex/Projects/theme-converter/components/plasma_b2c/0.3.0-rc.zip")
        name("SdService")
    }
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
