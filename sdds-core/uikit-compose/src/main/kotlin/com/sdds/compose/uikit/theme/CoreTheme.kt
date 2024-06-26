package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Базовая темы SDDS
 * @param typography начертания
 * @param content контент
 * @author Малышев Александр on 23.04.2024
 */
@Composable
fun CoreTheme(
    typography: CoreTypography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTypography provides typography,
        content = content,
    )
}

/**
 * Содержит удобные функции получения текущих значений темы
 */
object CoreTheme {

    /**
     * Типография
     */
    val typography: CoreTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}
