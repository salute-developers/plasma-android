package com.sdds.stylessalute.styles.switcher

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.stylessalute.theme.StylesSaluteTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(StylesSaluteTheme.typography.bodyLNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .descriptionStyle(StylesSaluteTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(StylesSaluteTheme.colors.textDefaultPrimary)
    descriptionColor(StylesSaluteTheme.colors.textDefaultSecondary)
    thumbColor(StylesSaluteTheme.colors.surfaceOnDarkSolidDefault)
    activeTrackColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain)
    inactiveTrackColor(StylesSaluteTheme.colors.surfaceDefaultTransparentTertiary)
}
