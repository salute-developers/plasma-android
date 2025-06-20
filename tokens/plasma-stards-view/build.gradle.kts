import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode
import utils.componentsVersion
import utils.themeUrl

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing")
    alias(libs.plugins.roborazzi)
    id("star-dimens-generator")
}

android {
    namespace = "com.sdkit.star.designsystem"
    resourcePrefix = "sdkit"
}

themeBuilder {
    themeSource {
        url(themeUrl)
        name("StarDs")
    }
//    componentSource(name = "plasma_stards", componentsVersion, "StarDs")
    componentSource {
        url("file:///Users/alex/Projects/theme-converter/components/plasma_stards/0.5.0-rc.zip")
        name("StarDs")
    }
    view {
        themeParents {
            materialComponentsTheme("NoActionBar")
            materialComponentsTheme("Dialog")
        }
        setupShapeAppearance(sddsShape())
    }
    ktPackage("com.sdkit.star.designsystem")
    resourcesPrefix(prefix = "sdkit")
    outputLocation(OutputLocation.SRC)
    autoGenerate(false)
    mode(ThemeBuilderMode.THEME)
    dimensions {
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
    }
}

dependencies {
    implementation(libs.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
    implementation(libs.base.android.material)
}
