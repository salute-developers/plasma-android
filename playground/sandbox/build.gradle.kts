import com.sdds.plugin.themebuilder.ThemeBuilderMode

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-app")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.sandbox"
    defaultConfig {
        applicationId = "com.sdds.playground.sandbox"
    }
}

themeBuilder {
    themeSource(name = "stylesSalute")
    view {
        themeParents {
            customTheme("Theme.SddsSandbox")
        }
    }
    resourcesPrefix("thmbldr")
    ktPackage("com.sdds.playground.sandbox.tokens")
    mode(ThemeBuilderMode.THEME)
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:icons")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    // Unit tests
    testImplementation(libs.base.test.unit.jUnit)
}
