// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.b2c.tokens.compose

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cColors
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cGradients
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cShapes
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTypography
import kotlin.Unit

public object PlasmaB2cTheme {
    public val colors: PlasmaB2cColors
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaB2cColors.current

    public val gradients: PlasmaB2cGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaB2cGradients.current

    public val shapes: PlasmaB2cShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaB2cShapes.current

    public val typography: PlasmaB2cTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalPlasmaB2cTypography.current
}

/**
 * Базовая тема PlasmaB2c
 */
@Composable
public fun PlasmaB2cTheme(
    colors: PlasmaB2cColors = PlasmaB2cTheme.colors,
    gradients: PlasmaB2cGradients = PlasmaB2cTheme.gradients,
    shapes: PlasmaB2cShapes = PlasmaB2cTheme.shapes,
    typography: PlasmaB2cTypography = dynamicPlasmaB2cTypography(),
    content: @Composable () -> Unit,
): Unit {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember { TextSelectionColors(handleColor =
            rememberColors.textDefaultAccent, backgroundColor =
            rememberColors.textDefaultAccent.copy(0.3f)) }

    CompositionLocalProvider(
        LocalPlasmaB2cColors provides rememberColors,
        LocalPlasmaB2cGradients provides gradients,
        LocalPlasmaB2cTypography provides typography,
        LocalPlasmaB2cShapes provides shapes,
        LocalTextSelectionColors provides textSelectionColors,
        content = { ProvideTextStyle(value = typography.bodyMNormal.copy(color =
            rememberColors.textDefaultPrimary), content = content,) },
    )
}
