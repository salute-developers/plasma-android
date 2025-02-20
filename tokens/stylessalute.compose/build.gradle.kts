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
    namespace = "com.sdds.stylessalute.compose"
    resourcePrefix = "salute_cmp"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("sdds serv version must be specified")
    themeSource(name = "stylesSalute", version = themeVersion)
    compose()
    autoGenerate(false)
    ktPackage(ktPackage = "com.sdds.stylessalute")
    mode(THEME)
    outputLocation(SRC)
}

dependencies {
    implementation(libs.sdds.uikit.compose)
    implementation(libs.base.androidX.compose.foundation)
}
