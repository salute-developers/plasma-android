package com.sdds.plasma.b2c.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaB2cTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(PlasmaB2cTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaB2cTheme.colors.textDefaultSecondary)
    thumbColor(PlasmaB2cTheme.colors.surfaceOnDarkSolidDefault)
    activeTrackColor(PlasmaB2cTheme.colors.surfaceDefaultPositive)
    inactiveTrackColor(PlasmaB2cTheme.colors.surfaceDefaultTransparentTertiary)
}
