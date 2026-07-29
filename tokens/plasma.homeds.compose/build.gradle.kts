import com.sdds.plugin.themebuilder.DefaultThemeTypography.SMALL
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
    id(libs.plugins.dsbuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.plasma.homeds.compose"
    resourcePrefix = themeResPrefix
}

dsBuilder {
    autoGenerate.set(false)
    compose()
    packageName.set("com.sdds.plasma.homeds")
    outputLocation.set(SRC)
    theme {
        mode.set(THEME)
        defaultTypography.set(SMALL)
    }
    components {
        source(name = componentsName, version = componentsVersion, alias = themeAlias)
        componentsMetaStyleClass.set(true)
    }
}

dependencies {
    testImplementation("integration-core:uikit-compose-fixtures")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
