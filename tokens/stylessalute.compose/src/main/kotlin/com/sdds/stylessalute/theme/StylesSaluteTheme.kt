// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.stylessalute.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.stylessalute.theme.StylesSaluteColors
import com.sdds.stylessalute.theme.StylesSaluteGradients
import com.sdds.stylessalute.theme.StylesSaluteShapes
import com.sdds.stylessalute.theme.StylesSaluteTypography
import kotlin.Unit

public object StylesSaluteTheme {
    public val colors: StylesSaluteColors
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteColors.current

    public val gradients: StylesSaluteGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteGradients.current

    public val shapes: StylesSaluteShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalStylesSaluteShapes.current

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
    typography: StylesSaluteTypography = dynamicStylesSaluteTypography(),
    content: @Composable () -> Unit,
): Unit {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember { TextSelectionColors(handleColor =
            rememberColors.textDefaultAccent, backgroundColor =
            rememberColors.textDefaultAccent.copy(0.3f)) }

    CompositionLocalProvider(
        LocalStylesSaluteColors provides rememberColors,
        LocalStylesSaluteGradients provides gradients,
        LocalStylesSaluteTypography provides typography,
        LocalStylesSaluteShapes provides shapes,
        LocalTextSelectionColors provides textSelectionColors,
        content = { ProvideTextStyle(value = typography.bodyMNormal.copy(color =
            rememberColors.textDefaultPrimary), content = content,) },
    )
}
