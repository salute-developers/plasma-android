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
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
}

android {
    namespace = "com.sdds.sbcom.compose"
    resourcePrefix = themeResPrefix
}

themeBuilder {
//    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    themeSource {
        url("file:///Users/alex/Projects/theme-converter/themes/sdds_sbcom/0.9.0-alpha.zip")
        name(themeAlias)
    }
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    componentSource {
        url("file:///Users/alex/Projects/theme-converter/components/sdds_sbcom/0.2.1.zip")
        name(themeAlias)
    }
    compose {
        componentsMetaStyleClass(true)
    }
    ktPackage(ktPackage = "com.sdds.sbcom")
    mode(THEME)
    outputLocation(SRC)
    autoGenerate(false)
    ignoreDisabledTokens(true)
}

dependencies {
    testImplementation("integration-core:uikit-compose-fixtures")
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
