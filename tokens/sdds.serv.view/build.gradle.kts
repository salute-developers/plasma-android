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
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.serv"
    resourcePrefix = "serv"
}

themeBuilder {
    themeSource(name = "sdds_serv", version = themeVersion, alias = "Sdds")
    componentSource(name = "sdds_serv", version = componentsVersion, alias = "Sdds")
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
