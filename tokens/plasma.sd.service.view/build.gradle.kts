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
    id(libs.plugins.dsbuilder.get().pluginId)
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

dsBuilder {
    view {
        themeParents {
            materialComponentsTheme()
        }
        setupShapeAppearance(sddsShape())
    }
    packageName.set("com.sdds.plasma.sd.service")
    outputLocation.set(OutputLocation.SRC)
    theme {
        source(name = themeName, version = themeVersion, alias = themeAlias)
        autoGenerate.set(false)
        mode.set(ThemeBuilderMode.THEME)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
    }
}

dependencies {
    testImplementation("integration-core:uikit-fixtures")
    implementation(icons.sdds.icons)
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
