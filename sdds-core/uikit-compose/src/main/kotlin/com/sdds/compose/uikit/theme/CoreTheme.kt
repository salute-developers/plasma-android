package com.sdds.compose.uikit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

/**
 * Базовая темы SDDS
 * @param colors цвета темы
 * @param gradients градиенты
 * @param typography начертания
 * @param shapes формы
 * @param content контент
 * @author Малышев Александр on 23.04.2024
 */
@Composable
fun CoreTheme(
    colors: CoreColors,
    gradients: CoreGradients,
    typography: CoreTypography,
    shapes: CoreShapes,
    content: @Composable () -> Unit,
    textSelectionColors: TextSelectionColors = remember {
        TextSelectionColors(
            handleColor = colors.textAccent,
            backgroundColor = colors.textAccent.copy(0.3f),
        )
    },
) {
    val rememberColors = remember { colors.copy() }
        .apply { updateColorsFrom(colors) }

    CompositionLocalProvider(
        LocalColors provides rememberColors,
        LocalGradients provides gradients,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        LocalRippleTheme provides CoreRippleTheme,
        LocalTextSelectionColors provides textSelectionColors,
        content = content,
    )
}

/**
 * Содержит удобные функции получения текущих значений темы
 */
object CoreTheme {

    /**
     * Цвета
     */
    val colors: CoreColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

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

private object CoreRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor(): Color = if (isSystemInDarkTheme()) {
        CoreTheme.colors.onDarkSurfaceSolidDefault
    } else {
        CoreTheme.colors.onLightSurfaceSolidDefault
    }

    @Composable
    override fun rippleAlpha(): RippleAlpha = if (isSystemInDarkTheme()) {
        DarkThemeRippleAlpha
    } else {
        LightThemeHighContrastRippleAlpha
    }
}
