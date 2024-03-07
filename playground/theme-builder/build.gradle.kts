import com.sdds.plugin.themebuilder.ThemeBuilderExtension
import com.sdds.plugin.themebuilder.ThemeBuilderTarget

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("convention.android-lib")
    id(libs.plugins.themebuilder.get().pluginId)
}

android {
    namespace = "com.sdds.playground.themebuilder"
}

configure<ThemeBuilderExtension> {
    themeUrl.set("file://${projectDir.path}/new_theme_scheme.json")
    target.set(ThemeBuilderTarget.COMPOSE.value)
}
