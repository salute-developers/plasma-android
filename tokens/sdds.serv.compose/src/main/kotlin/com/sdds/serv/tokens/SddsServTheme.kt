// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.tokens

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.serv.tokens.SddsServColors
import com.sdds.serv.tokens.SddsServGradients
import com.sdds.serv.tokens.SddsServShapes
import com.sdds.serv.tokens.SddsServTypography
import kotlin.Unit

public object SddsServTheme {
    public val colors: SddsServColors
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsServColors.current

    public val gradients: SddsServGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsServGradients.current

    public val shapes: SddsServShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsServShapes.current

    public val typography: SddsServTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalSddsServTypography.current
}

/**
 * Базовая тема SddsServ
 */
@Composable
public fun SddsServTheme(
    colors: SddsServColors = SddsServTheme.colors,
    gradients: SddsServGradients = SddsServTheme.gradients,
    shapes: SddsServShapes = defaultSddsServShapes(),
    typography: SddsServTypography = dynamicSddsServTypography(),
    content: @Composable () -> Unit,
): Unit {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember { TextSelectionColors(handleColor =
            rememberColors.textDefaultAccent, backgroundColor =
            rememberColors.textDefaultAccent.copy(0.3f)) }

    CompositionLocalProvider(
        LocalSddsServColors provides rememberColors,
        LocalSddsServGradients provides gradients,
        LocalSddsServTypography provides typography,
        LocalSddsServShapes provides shapes,
        LocalTextSelectionColors provides textSelectionColors,
        content = { ProvideTextStyle(value = typography.bodyMNormal.copy(color =
            rememberColors.textDefaultPrimary), content = content,) },
    )
}
