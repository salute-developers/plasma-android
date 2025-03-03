import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id("convention.testing-compose")
    id(libs.plugins.themebuilder.get().pluginId)
    alias(libs.plugins.roborazzi)
    id("star-dimens-generator")
}

android {
    namespace = "com.sdkit.star.designsystem.compose"
    resourcePrefix = "sdkit_cmp"
}

themeBuilder {
    themeSource {
        val themeUrl = properties["theme-url"]?.toString()
            ?: throw GradleException("theme-url must be specified for ThemeBuilder to work")
        url(themeUrl)
        name("StarDs")
    }
    componentsSource("https://github.com/salute-developers/theme-converter/raw/main/components/plasma_stards")
    compose()
    ktPackage("com.sdkit.star.designsystem")
    resourcesPrefix(prefix = "sdkit_cmp")
    outputLocation(OutputLocation.SRC)
    autoGenerate(false)
    mode(ThemeBuilderMode.THEME)
    dimensions {
        fromResources(true)
        multiplier(2f)
        breakPoints {
            large(960)
            medium(560)
        }
    }
}
dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
