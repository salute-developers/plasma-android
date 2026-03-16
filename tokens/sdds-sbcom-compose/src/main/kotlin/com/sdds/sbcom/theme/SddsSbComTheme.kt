// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы SddsSbComTheme
 */
public object SddsSbComTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: SddsSbComColors
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: SddsSbComGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: SddsSbComShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: SddsSbComShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: SddsSbComSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: SddsSbComTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSbComTypography.current
}

/**
 * Базовая тема SddsSbCom
 */
@Composable
public fun SddsSbComTheme(
    colors: SddsSbComColors = SddsSbComTheme.colors,
    gradients: SddsSbComGradients = SddsSbComTheme.gradients,
    shapes: SddsSbComShapes = defaultSddsSbComShapes(),
    shadows: SddsSbComShadows = defaultSddsSbComShadows(),
    typography: SddsSbComTypography = dynamicSddsSbComTypography(),
    spacing: SddsSbComSpacing = defaultSddsSbComSpacing(),
    content: @Composable () -> Unit,
) {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember {
        TextSelectionColors(
            handleColor = rememberColors.textDefaultAccent,
            backgroundColor = rememberColors.textDefaultAccent.copy(0.3f),
        )
    }

    CompositionLocalProvider(
        LocalSddsSbComColors provides rememberColors,
        LocalSddsSbComGradients provides gradients,
        LocalSddsSbComTypography provides typography,
        LocalSddsSbComShapes provides shapes,
        LocalSddsSbComShadows provides shadows,
        LocalSddsSbComSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            DefaultComponents {
                ProvideTextStyle(
                    value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                    content = content,
                )
            }
        },
    )
}
