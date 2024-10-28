package com.sdds.playground.sandbox.chip

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.playground.sandbox.tokens.compose.SddsServTheme

/**
 *
 * @author Малышев Александр on 25.10.2024
 */
internal val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .shape(SddsServTheme.shapes.roundM)
        .dimensions(
            Chip.Dimensions(
                height = 48.dp,
                startContentSize = 24.dp,
                endContentSize = 24.dp,
                startContentMargin = 8.dp,
                endContentMargin = 8.dp,
                startPadding = 16.dp,
                endPadding = 16.dp,
            ),
        )

internal val Chip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .dimensions(
            Chip.Dimensions(
                height = 40.dp,
                startContentSize = 24.dp,
                endContentSize = 24.dp,
                startContentMargin = 6.dp,
                endContentMargin = 6.dp,
                startPadding = 14.dp,
                endPadding = 14.dp,
            ),
        )

internal val Chip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .shape(SddsServTheme.shapes.roundS)
        .dimensions(
            Chip.Dimensions(
                height = 32.dp,
                startContentSize = 16.dp,
                endContentSize = 16.dp,
                startContentMargin = 4.dp,
                endContentMargin = 4.dp,
                startPadding = 12.dp,
                endPadding = 12.dp,
            ),
        )

internal val Chip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions(
            Chip.Dimensions(
                height = 24.dp,
                startContentSize = 12.dp,
                endContentSize = 12.dp,
                startContentMargin = 2.dp,
                endContentMargin = 2.dp,
                startPadding = 10.dp,
                endPadding = 10.dp,
            ),
        )

internal val EmbeddedChip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyLNormal)
        .shape(SddsServTheme.shapes.roundS)
        .dimensions(
            Chip.Dimensions(
                height = 44.dp,
                startContentSize = 24.dp,
                endContentSize = 24.dp,
                startContentMargin = 8.dp,
                endContentMargin = 8.dp,
                startPadding = 16.dp,
                endPadding = 16.dp,
            ),
        )

internal val EmbeddedChip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions(
            Chip.Dimensions(
                height = 36.dp,
                startContentSize = 24.dp,
                endContentSize = 24.dp,
                startContentMargin = 6.dp,
                endContentMargin = 6.dp,
                startPadding = 14.dp,
                endPadding = 14.dp,
            ),
        )

internal val EmbeddedChip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .shape(SddsServTheme.shapes.roundXxs)
        .dimensions(
            Chip.Dimensions(
                height = 28.dp,
                startContentSize = 16.dp,
                endContentSize = 16.dp,
                startContentMargin = 4.dp,
                endContentMargin = 4.dp,
                startPadding = 12.dp,
                endPadding = 12.dp,
            ),
        )

internal val EmbeddedChip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .shape(SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
        .dimensions(
            Chip.Dimensions(
                height = 20.dp,
                startContentSize = 12.dp,
                endContentSize = 12.dp,
                startContentMargin = 2.dp,
                endContentMargin = 2.dp,
                startPadding = 10.dp,
                endPadding = 10.dp,
            ),
        )

internal val ChipStyleBuilder.Pilled: ChipStyleBuilder
    get() = this.shape(RoundedCornerShape(50))

internal val ChipStyleBuilder.Default: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            SddsServTheme.colors.textInversePrimary.asInteractive(
                pressed = SddsServTheme.colors.textInversePrimaryActive,
            ),
        )
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                pressed = SddsServTheme.colors.surfaceDefaultSolidDefaultActive,
            ),
        )
    }

internal val ChipStyleBuilder.Secondary: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            SddsServTheme.colors.textDefaultPrimary.asInteractive(
                pressed = SddsServTheme.colors.textDefaultPrimaryActive,
            ),
        )
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                pressed = SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive,
            ),
        )
    }

internal val ChipStyleBuilder.Accent: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = SddsServTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            SddsServTheme.colors.surfaceDefaultAccent.asInteractive(
                pressed = SddsServTheme.colors.surfaceDefaultAccentActive,
            ),
        )
    }
