package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import com.sdds.compose.uikit.theme.RippleTheme.Companion.defaultRippleAlpha
import com.sdds.compose.uikit.theme.RippleTheme.Companion.defaultRippleColor

/**
 * Тема ripple
 * @author Малышев Александр on 23.04.2024
 */
interface RippleTheme {

    /**
     * Цвет ripple по-умолчанию
     */
    @Composable
    fun defaultColor(): Color

    /**
     * Значения альфа канала для ripple эффекта
     */
    @Composable
    fun rippleAlpha(): RippleAlpha

    companion object {
        /**
         * Значение цвета по-умолчанию
         *
         * @param contentColor цвет контента
         * @param lightTheme индикатор светлой темы
         */
        fun defaultRippleColor(contentColor: Color, lightTheme: Boolean): Color =
            if (!lightTheme && contentColor.luminance() < 0.5) {
                Color.White
            } else {
                contentColor
            }

        /**
         * Значения по-умолчанию альфа канала для ripple эффекта
         *
         * @param contentColor цвет контента
         * @param lightTheme индикатор светлой темы
         */
        fun defaultRippleAlpha(contentColor: Color, lightTheme: Boolean): RippleAlpha {
            return when {
                lightTheme -> {
                    if (contentColor.luminance() > 0.5) {
                        LightThemeHighContrastRippleAlpha
                    } else {
                        LightThemeLowContrastRippleAlpha
                    }
                }

                else -> {
                    DarkThemeRippleAlpha
                }
            }
        }
    }
}

/**
 * Значения альфа канала для ripple эффекта
 * @property draggedAlpha альфа элемента в состоянии dragged = true
 * @property focusedAlpha альфа элемента в состоянии focused = true
 * @property hoveredAlpha альфа элемента в состоянии hovered = true
 * @property pressedAlpha альфа элемента в состоянии pressed = true
 */
@Immutable
data class RippleAlpha(
    val draggedAlpha: Float,
    val focusedAlpha: Float,
    val hoveredAlpha: Float,
    val pressedAlpha: Float,
)

internal val LightThemeHighContrastRippleAlpha = RippleAlpha(
    pressedAlpha = 0.24f,
    focusedAlpha = 0.24f,
    draggedAlpha = 0.16f,
    hoveredAlpha = 0.08f,
)

internal val LightThemeLowContrastRippleAlpha = RippleAlpha(
    pressedAlpha = 0.12f,
    focusedAlpha = 0.12f,
    draggedAlpha = 0.08f,
    hoveredAlpha = 0.04f,
)

internal val DarkThemeRippleAlpha = RippleAlpha(
    pressedAlpha = 0.10f,
    focusedAlpha = 0.12f,
    draggedAlpha = 0.08f,
    hoveredAlpha = 0.04f,
)

@Immutable
private object DebugRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor() = defaultRippleColor(Color.Black, lightTheme = true)

    @Composable
    override fun rippleAlpha(): RippleAlpha = defaultRippleAlpha(
        Color.Black,
        lightTheme = true,
    )
}

/**
 * CompositionLocal для [RippleTheme]
 */
val LocalRippleTheme: ProvidableCompositionLocal<RippleTheme> = staticCompositionLocalOf { DebugRippleTheme }
