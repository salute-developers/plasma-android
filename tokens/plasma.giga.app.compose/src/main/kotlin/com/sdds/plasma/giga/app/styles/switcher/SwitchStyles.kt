package com.sdds.plasma.giga.app.styles.switcher

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(PlasmaGigaAppTheme.colors.textDefaultPrimary)
    descriptionColor(PlasmaGigaAppTheme.colors.textDefaultSecondary)
    thumbColor(PlasmaGigaAppTheme.colors.surfaceInverseSolidDefault)
    activeTrackColor(PlasmaGigaAppTheme.colors.surfaceDefaultAccent)
    inactiveTrackColor(PlasmaGigaAppTheme.colors.surfaceDefaultTransparentTertiary)
}
