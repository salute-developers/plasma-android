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
    namespace = "com.sdds.compose.sandbox"
}

themeBuilder {
    themeSource(name = themeName, version = themeVersion, alias = themeAlias)
    componentSource(name = componentsName, version = componentsVersion, alias = themeAlias)
    compose()
    ktPackage(ktPackage = "com.sdds.compose.sandbox")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}

dependencies {

    implementation(project(":sandbox-core"))
    implementation(libs.sdds.uikit.compose)
    implementation(icons.sdds.icons)

    implementation(libs.base.androidX.compose.foundation)
    implementation(libs.base.androidX.activity.compose)
    implementation(libs.base.androidX.activity)
    implementation(libs.base.androidX.lifecycle.compose.viewmodel)
    implementation(libs.base.androidX.navigation.compose)


    // Preview support
    implementation(libs.base.androidX.compose.uiTooling.preview)
    implementation(libs.appcompat)
    debugImplementation(libs.base.androidX.compose.uiTooling)
}
