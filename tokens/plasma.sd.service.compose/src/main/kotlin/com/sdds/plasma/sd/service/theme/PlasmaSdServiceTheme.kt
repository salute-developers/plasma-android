// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.fs.FocusSelectorBorders
import com.sdds.compose.uikit.fs.FocusSelectorScales
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import kotlin.Unit

/**
 * Аттрибуты темы PlasmaSdServiceTheme
 */
public object PlasmaSdServiceTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: PlasmaSdServiceColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: PlasmaSdServiceGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: PlasmaSdServiceShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: PlasmaSdServiceShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: PlasmaSdServiceSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: PlasmaSdServiceTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceTypography.current
}

/**
 * Базовая тема PlasmaSdService
 */
@Composable
public fun PlasmaSdServiceTheme(
    colors: PlasmaSdServiceColors = PlasmaSdServiceTheme.colors,
    gradients: PlasmaSdServiceGradients = PlasmaSdServiceTheme.gradients,
    shapes: PlasmaSdServiceShapes = defaultPlasmaSdServiceShapes(),
    shadows: PlasmaSdServiceShadows = defaultPlasmaSdServiceShadows(),
    typography: PlasmaSdServiceTypography = dynamicPlasmaSdServiceTypography(),
    spacing: PlasmaSdServiceSpacing = defaultPlasmaSdServiceSpacing(),
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
        LocalPlasmaSdServiceColors provides rememberColors,
        LocalPlasmaSdServiceGradients provides gradients,
        LocalPlasmaSdServiceTypography provides typography,
        LocalPlasmaSdServiceShapes provides shapes,
        LocalPlasmaSdServiceShadows provides shadows,
        LocalPlasmaSdServiceSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        LocalFocusSelectorSettings provides FocusSelectorSettings.builder()
            .border(
                FocusSelectorBorders.solid(
                    strokeWidth = 1.dp,
                    strokeInsets = 2.dp,
                    color = rememberColors.surfaceDefaultAccent,
                ),
            )
            .scale(FocusSelectorScales.none())
            .build(),
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
