import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig.Companion.sddsShape
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id(libs.plugins.dsbuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
    resourcePrefix = "thmbldr"
}

dsBuilder {
    autoGenerate.set(false)
    targets {
        view {
            themeParents {
                materialComponentsTheme()
            }
            setupShapeAppearance(sddsShape())
        }
        compose()
    }
    packageName.set("com.sdds.playground.themebuilder")
    outputLocation.set(OutputLocation.BUILD)
    dimensions {
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
        fromResources(false)
    }
    theme {
        sources(baseAlias = "SddsServ") {
            defaultSourceFromUrl(
                name = "sdds_serv",
                url = "file://${projectDir.path}/json/latest.zip",
            )
            sourceFromUrl(
                name = "sdds_serv",
                url = "file://${projectDir.path}/json/latest_gold.zip",
                tenant = "Gold",
            )
        }
        mode.set(ThemeBuilderMode.THEME)
    }
    components {
        source("file://${projectDir.path}/json/test_components.zip")
    }
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
}
