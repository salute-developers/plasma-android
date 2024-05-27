package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Базовая темы SDDS
 * @param gradients градиенты
 * @param typography начертания
 * @param shapes формы
 * @param content контент
 * @author Малышев Александр on 23.04.2024
 */
@Composable
fun CoreTheme(
    gradients: CoreGradients,
    typography: CoreTypography,
    shapes: CoreShapes,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalGradients provides gradients,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        content = content,
    )
}

/**
 * Содержит удобные функции получения текущих значений темы
 */
object CoreTheme {

    /**
     * Градиенты
     */
    val gradients: CoreGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalGradients.current

    /**
     * Типография
     */
    val typography: CoreTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    /**
     * Формы
     */
    val shapes: CoreShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current
}
