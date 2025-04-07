// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.giga.app.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы PlasmaGigaAppTheme
 */
public object PlasmaGigaAppTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: PlasmaGigaAppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: PlasmaGigaAppGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: PlasmaGigaAppShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: PlasmaGigaAppShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: PlasmaGigaAppSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: PlasmaGigaAppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaGigaAppTypography.current
}

/**
 * Базовая тема PlasmaGigaApp
 */
@Composable
public fun PlasmaGigaAppTheme(
    colors: PlasmaGigaAppColors = PlasmaGigaAppTheme.colors,
    gradients: PlasmaGigaAppGradients = PlasmaGigaAppTheme.gradients,
    shapes: PlasmaGigaAppShapes = defaultPlasmaGigaAppShapes(),
    shadows: PlasmaGigaAppShadows = defaultPlasmaGigaAppShadows(),
    typography: PlasmaGigaAppTypography = dynamicPlasmaGigaAppTypography(),
    spacing: PlasmaGigaAppSpacing = defaultPlasmaGigaAppSpacing(),
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
        LocalPlasmaGigaAppColors provides rememberColors,
        LocalPlasmaGigaAppGradients provides gradients,
        LocalPlasmaGigaAppTypography provides typography,
        LocalPlasmaGigaAppShapes provides shapes,
        LocalPlasmaGigaAppShadows provides shadows,
        LocalPlasmaGigaAppSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
