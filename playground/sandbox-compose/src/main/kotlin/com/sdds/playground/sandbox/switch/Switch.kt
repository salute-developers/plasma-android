package com.sdds.playground.sandbox.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchColorsBuilder
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации [SwitchStyle]
 * @author Малышев Александр on 17.10.2024
 */
internal val Switch.L: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .descriptionStyle(SddsServTheme.typography.bodyMNormal)

internal val Switch.M: SwitchStyleBuilder
    @Composable
    get() = SwitchStyle.builder()
        .colors { defaultColors() }
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .descriptionStyle(SddsServTheme.typography.bodySNormal)

internal val Switch.S: SwitchStyleBuilder
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
    activeTrackColor(SddsServTheme.colors.surfaceDefaultPositive)
    inactiveTrackColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary)
}
