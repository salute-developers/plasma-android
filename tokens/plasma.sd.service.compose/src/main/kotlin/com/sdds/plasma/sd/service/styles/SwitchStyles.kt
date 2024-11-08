package com.sdds.plasma.sd.service.styles

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(PlasmaSdServiceTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaSdServiceTheme.colors.textDefaultSecondary)
    thumbColor(PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault)
    activeTrackColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent)
    inactiveTrackColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary)
}
