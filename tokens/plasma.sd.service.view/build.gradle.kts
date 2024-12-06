import com.sdds.plugin.themebuilder.OutputLocation
import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
    id("convention.maven-publish")
    id("convention.auto-bump")
}

android {
    namespace = "com.sdds.plasma.sd.service"
    resourcePrefix = "sd_service"
}

themeBuilder {
    val themeVersion = project.property("theme-version")?.toString()
        ?: throw GradleException("plasma sd service version must be specified")
    themeSource(name = "plasma_b2c", version = themeVersion, alias = "PlasmaSdService")
    view()
    autoGenerate(false)
    mode(ThemeBuilderMode.THEME)
    outputLocation(OutputLocation.SRC)
}

dependencies {
    implementation(libs.sdds.uikit)
    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)
}
