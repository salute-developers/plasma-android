import com.sdds.plugin.themebuilder.ThemeBuilderExtension
import com.sdds.plugin.themebuilder.ThemeBuilderTarget

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
    resourcePrefix = "thmbldr"
}

configure<ThemeBuilderExtension> {
    themeUrl.set("file://${projectDir.path}/json/plasma_b2c.zip")
    target.set(ThemeBuilderTarget.ALL)
    packageName.set("com.sdds.playground.themebuilder.tokens")
}

dependencies {
    implementation("sdds-core:uikit")
    implementation("sdds-core:uikit-compose")

    implementation(libs.base.androidX.core)
    implementation(libs.base.androidX.appcompat)

    val composeBom = platform(libs.base.androidX.compose.bom)
    implementation(composeBom)
    implementation(libs.base.androidX.compose.foundation)
}
