package com.sdds.playground.sandbox.switch

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.sdds.compose.uikit.SwitchColors
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 * Вариации [SwitchStyle]
 * @author Малышев Александр on 17.10.2024
 */
internal object Switch {

    val L: SwitchStyle
        @Composable
        @ReadOnlyComposable
        get() = SwitchStyle.create(
            colors = SwitchColors.create(
                labelColor = SddsServTheme.colors.textDefaultPrimary,
                descriptionColor = SddsServTheme.colors.textDefaultSecondary,
                thumbColor = SddsServTheme.colors.surfaceOnDarkSolidDefault,
                activeTrackColor = SddsServTheme.colors.surfaceDefaultPositive,
                inactiveTrackColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
            ),
            labelTextStyle = SddsServTheme.typography.bodyLNormal,
            descriptionTextStyle = SddsServTheme.typography.bodyMNormal,
        )

    val M: SwitchStyle
        @Composable
        @ReadOnlyComposable
        get() = SwitchStyle.create(
            colors = SwitchColors.create(
                labelColor = SddsServTheme.colors.textDefaultPrimary,
                descriptionColor = SddsServTheme.colors.textDefaultSecondary,
                thumbColor = SddsServTheme.colors.surfaceOnDarkSolidDefault,
                activeTrackColor = SddsServTheme.colors.surfaceDefaultPositive,
                inactiveTrackColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
            ),
            labelTextStyle = SddsServTheme.typography.bodyMNormal,
            descriptionTextStyle = SddsServTheme.typography.bodySNormal,
        )

    val S: SwitchStyle
        @Composable
        @ReadOnlyComposable
        get() = SwitchStyle.create(
            colors = SwitchColors.create(
                labelColor = SddsServTheme.colors.textDefaultPrimary,
                descriptionColor = SddsServTheme.colors.textDefaultSecondary,
                thumbColor = SddsServTheme.colors.surfaceOnDarkSolidDefault,
                activeTrackColor = SddsServTheme.colors.surfaceDefaultPositive,
                inactiveTrackColor = SddsServTheme.colors.surfaceDefaultTransparentTertiary,
            ),
            labelTextStyle = SddsServTheme.typography.bodySNormal,
            descriptionTextStyle = SddsServTheme.typography.bodyXsNormal,
        )
}
