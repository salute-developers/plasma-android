// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.tokens

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.plasma.sd.service.tokens.PlasmaSdServiceColors
import com.sdds.plasma.sd.service.tokens.PlasmaSdServiceGradients
import com.sdds.plasma.sd.service.tokens.PlasmaSdServiceShapes
import com.sdds.plasma.sd.service.tokens.PlasmaSdServiceTypography
import kotlin.Unit

public object PlasmaSdServiceTheme {
    public val colors: PlasmaSdServiceColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceColors.current

    public val gradients: PlasmaSdServiceGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceGradients.current

    public val shapes: PlasmaSdServiceShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaSdServiceShapes.current

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
    typography: PlasmaSdServiceTypography = dynamicPlasmaSdServiceTypography(),
    content: @Composable () -> Unit,
): Unit {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember { TextSelectionColors(handleColor =
            rememberColors.textDefaultAccent, backgroundColor =
            rememberColors.textDefaultAccent.copy(0.3f)) }

    CompositionLocalProvider(
        LocalPlasmaSdServiceColors provides rememberColors,
        LocalPlasmaSdServiceGradients provides gradients,
        LocalPlasmaSdServiceTypography provides typography,
        LocalPlasmaSdServiceShapes provides shapes,
        LocalTextSelectionColors provides textSelectionColors,
        content = { ProvideTextStyle(value = typography.bodyMNormal.copy(color =
            rememberColors.textDefaultPrimary), content = content,) },
    )
}
