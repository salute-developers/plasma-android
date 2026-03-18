import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME
import utils.componentsName
import utils.componentsVersion
import utils.themeAlias
import utils.themeName
import utils.themeVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.maven-publish")
    id("convention.compose")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

group = "integration-core"

android {
    namespace = "com.sdds.view.sandbox"
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    compose()
    ktPackage(ktPackage = "com.sdds.view.sandbox")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}

dependencies {
    implementation(project(":sandbox-core"))
    implementation(project(":sandbox-compose"))
    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.core)
    implementation(libs.sdds.uikit)
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)
}
