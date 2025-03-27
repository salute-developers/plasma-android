package com.sdds.plasma.giga.styles.switcher

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(PlasmaGigaTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaTheme.colors.textDefaultSecondary)
    thumbColor(PlasmaGigaTheme.colors.surfaceInverseSolidDefault)
    activeTrackColor(PlasmaGigaTheme.colors.surfaceDefaultAccent)
    inactiveTrackColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary)
}
