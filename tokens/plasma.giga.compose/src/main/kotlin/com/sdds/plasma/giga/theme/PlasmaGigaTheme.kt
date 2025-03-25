// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы PlasmaGigaTheme
 */
public object PlasmaGigaTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: PlasmaGigaColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: PlasmaGigaGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: PlasmaGigaShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: PlasmaGigaShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: PlasmaGigaSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: PlasmaGigaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaTypography.current
}

/**
 * Базовая тема PlasmaGiga
 */
@Composable
public fun PlasmaGigaTheme(
    colors: PlasmaGigaColors = PlasmaGigaTheme.colors,
    gradients: PlasmaGigaGradients = PlasmaGigaTheme.gradients,
    shapes: PlasmaGigaShapes = defaultPlasmaGigaShapes(),
    shadows: PlasmaGigaShadows = defaultPlasmaGigaShadows(),
    typography: PlasmaGigaTypography = dynamicPlasmaGigaTypography(),
    spacing: PlasmaGigaSpacing = defaultPlasmaGigaSpacing(),
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
        LocalPlasmaGigaColors provides rememberColors,
        LocalPlasmaGigaGradients provides gradients,
        LocalPlasmaGigaTypography provides typography,
        LocalPlasmaGigaShapes provides shapes,
        LocalPlasmaGigaShadows provides shadows,
        LocalPlasmaGigaSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
