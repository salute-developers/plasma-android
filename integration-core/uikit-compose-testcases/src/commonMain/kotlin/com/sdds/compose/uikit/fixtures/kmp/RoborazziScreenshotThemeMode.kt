package com.sdds.compose.uikit.fixtures.kmp

/**
 * Enum для разных theme modes.
 */
@Suppress("UndocumentedPublicProperty")
enum class RoborazziScreenshotThemeMode(
    val suffix: String,
    val darkTheme: Boolean,
) {
    Light(suffix = "light", darkTheme = false),
    Dark(suffix = "dark", darkTheme = true),
}
