// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.stylessalute.theme

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
 * Аттрибуты темы StylesSaluteTheme
 */
public object StylesSaluteTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: StylesSaluteColors
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: StylesSaluteGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: StylesSaluteShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: StylesSaluteShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: StylesSaluteSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: StylesSaluteTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteTypography.current
}

/**
 * Базовая тема StylesSalute
 */
@Composable
public fun StylesSaluteTheme(
    colors: StylesSaluteColors = StylesSaluteTheme.colors,
    gradients: StylesSaluteGradients = StylesSaluteTheme.gradients,
    shapes: StylesSaluteShapes = defaultStylesSaluteShapes(),
    shadows: StylesSaluteShadows = defaultStylesSaluteShadows(),
    typography: StylesSaluteTypography = dynamicStylesSaluteTypography(),
    spacing: StylesSaluteSpacing = defaultStylesSaluteSpacing(),
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
        LocalStylesSaluteColors provides rememberColors,
        LocalStylesSaluteGradients provides gradients,
        LocalStylesSaluteTypography provides typography,
        LocalStylesSaluteShapes provides shapes,
        LocalStylesSaluteShadows provides shadows,
        LocalStylesSaluteSpacing provides spacing,
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
