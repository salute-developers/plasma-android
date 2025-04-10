import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
    resourcePrefix = "thmbldr"
}

themeBuilder {
    themeSource {
        url("file://${projectDir.path}/json/test_theme.zip")
        name("sdds_serv")
    }
    componentSource {
        url("file://${projectDir.path}/json/test_components.zip")
        name("sdds_serv")
    }
    view {
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    compose()
    ktPackage("com.sdds.playground.themebuilder")
    mode(ThemeBuilderMode.THEME)
    outputLocation(OutputLocation.BUILD)
    autoGenerate(false)
    dimensions {
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
        fromResources(false)
    }
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
}
