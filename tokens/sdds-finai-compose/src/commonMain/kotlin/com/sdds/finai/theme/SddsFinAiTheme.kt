// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.finai.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы SddsFinAiTheme
 */
public object SddsFinAiTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: SddsFinAiColors
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: SddsFinAiGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: SddsFinAiShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: SddsFinAiShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: SddsFinAiSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: SddsFinAiTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsFinAiTypography.current
}

/**
 * Базовая тема SddsFinAi
 */
@Composable
public fun SddsFinAiTheme(
    colors: SddsFinAiColors = SddsFinAiTheme.colors,
    gradients: SddsFinAiGradients = SddsFinAiTheme.gradients,
    shapes: SddsFinAiShapes = defaultSddsFinAiShapes(),
    shadows: SddsFinAiShadows = defaultSddsFinAiShadows(),
    typography: SddsFinAiTypography = dynamicSddsFinAiTypography(),
    spacing: SddsFinAiSpacing = defaultSddsFinAiSpacing(),
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
        LocalSddsFinAiColors provides rememberColors,
        LocalSddsFinAiGradients provides gradients,
        LocalSddsFinAiTypography provides typography,
        LocalSddsFinAiShapes provides shapes,
        LocalSddsFinAiShadows provides shadows,
        LocalSddsFinAiSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
