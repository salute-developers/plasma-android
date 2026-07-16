// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.compose.sandbox.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import kotlin.Unit

/**
 * Аттрибуты темы SddsSandboxTheme
 */
public object SddsSandboxTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: SddsSandboxColors
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: SddsSandboxGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: SddsSandboxShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: SddsSandboxShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: SddsSandboxSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: SddsSandboxTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsSandboxTypography.current
}

/**
 * Базовая тема SddsSandbox
 */
@Composable
public fun SddsSandboxTheme(
    colors: SddsSandboxColors = SddsSandboxTheme.colors,
    gradients: SddsSandboxGradients = SddsSandboxTheme.gradients,
    shapes: SddsSandboxShapes = defaultSddsSandboxShapes(),
    shadows: SddsSandboxShadows = defaultSddsSandboxShadows(),
    typography: SddsSandboxTypography = dynamicSddsSandboxTypography(),
    spacing: SddsSandboxSpacing = defaultSddsSandboxSpacing(),
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
        LocalSddsSandboxColors provides rememberColors,
        LocalSddsSandboxGradients provides gradients,
        LocalSddsSandboxTypography provides typography,
        LocalSddsSandboxShapes provides shapes,
        LocalSddsSandboxShadows provides shadows,
        LocalSddsSandboxSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
