import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id("convention.compose")
    id("convention.maven-publish")
    id("convention.auto-bump")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.serv"
    resourcePrefix = "serv"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("star design service version must be specified")
    themeSource(name = "sdds_serv", version = themeVersion, alias = "SddsServ")
    compose()
    ktPackage(ktPackage = "com.sdds.serv.tokens")
    autoGenerate(false)
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation("sdds-core:uikit-compose")
    implementation(libs.base.androidX.compose.foundation)
}
