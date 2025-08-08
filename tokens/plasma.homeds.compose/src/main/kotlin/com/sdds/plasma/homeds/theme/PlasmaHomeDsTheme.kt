// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.homeds.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы PlasmaHomeDsTheme
 */
public object PlasmaHomeDsTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: PlasmaHomeDsColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: PlasmaHomeDsGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: PlasmaHomeDsShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: PlasmaHomeDsShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: PlasmaHomeDsSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: PlasmaHomeDsTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaHomeDsTypography.current
}

/**
 * Базовая тема PlasmaHomeDs
 */
@Composable
public fun PlasmaHomeDsTheme(
    colors: PlasmaHomeDsColors = PlasmaHomeDsTheme.colors,
    gradients: PlasmaHomeDsGradients = PlasmaHomeDsTheme.gradients,
    shapes: PlasmaHomeDsShapes = defaultPlasmaHomeDsShapes(),
    shadows: PlasmaHomeDsShadows = defaultPlasmaHomeDsShadows(),
    typography: PlasmaHomeDsTypography = dynamicPlasmaHomeDsTypography(),
    spacing: PlasmaHomeDsSpacing = defaultPlasmaHomeDsSpacing(),
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
        LocalPlasmaHomeDsColors provides rememberColors,
        LocalPlasmaHomeDsGradients provides gradients,
        LocalPlasmaHomeDsTypography provides typography,
        LocalPlasmaHomeDsShapes provides shapes,
        LocalPlasmaHomeDsShadows provides shadows,
        LocalPlasmaHomeDsSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
