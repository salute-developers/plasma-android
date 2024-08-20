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
    themeSource("file://${projectDir.path}/json/test_theme.zip")
    view {
        themeParents {
            customTheme("Thmbldr.Theme.App.Test")
        }
        setupShapeAppearance(sddsShape())
    }
    compose()
    ktPackage("com.sdds.playground.themebuilder.tokens")
    mode(ThemeBuilderMode.THEME)
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    implementation(libs.base.androidX.compose.foundation)
}
