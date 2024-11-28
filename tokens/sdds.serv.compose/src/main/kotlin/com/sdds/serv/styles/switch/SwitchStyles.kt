package com.sdds.serv.styles.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.serv.tokens.compose.SddsServTheme

/**
 * Стиль [Switch] размера L
 */
val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .descriptionStyle(SddsServTheme.typography.bodyMNormal)

/**
 * Стиль [Switch] размера M
 */
val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .descriptionStyle(SddsServTheme.typography.bodySNormal)

/**
 * Стиль [Switch] размера S
 */
val Switch.S: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)

@Composable
@ReadOnlyComposable
private fun SwitchColorsBuilder.defaultColors(): SwitchColorsBuilder = apply {
    labelColor(SddsServTheme.colors.textDefaultPrimary)
    descriptionColor(SddsServTheme.colors.textDefaultSecondary)
    thumbColor(SddsServTheme.colors.surfaceOnDarkSolidDefault)
    activeTrackColor(SddsServTheme.colors.surfaceDefaultAccent)
    inactiveTrackColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary)
}
