import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

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
    namespace = "com.sdds.serv.compose"
    resourcePrefix = "serv_cmp"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "sdds_serv", version = themeVersion, alias = "SddsServ")
    compose()
    ktPackage(ktPackage = "com.sdds.serv")
    mode(THEME)
    autoGenerate(false)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.sdds.icons)
    implementation(libs.base.androidX.compose.foundation)
}
