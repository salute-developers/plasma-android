package com.sdds.compose.uikit.fixtures.kmp

import androidx.compose.runtime.Composable

/**
 * Тема для скриншотов
 */
@Suppress("UndocumentedPublicFunction")
interface RoborazziScreenshotTheme {

    @Composable
    fun content(
        darkTheme: Boolean,
        content: @Composable () -> Unit,
    )
}
