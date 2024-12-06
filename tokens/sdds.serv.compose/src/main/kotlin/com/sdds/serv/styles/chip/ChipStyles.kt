package com.sdds.serv.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.serv.theme.SddsServTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
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

/**
 * Стиль [Chip] размера M
 */
val Chip.M: ChipStyleBuilder
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

/**
 * Стиль [Chip] размера S
 */
val Chip.S: ChipStyleBuilder
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

/**
 * Стиль [Chip] размера Xs
 */
val Chip.Xs: ChipStyleBuilder
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

/**
 * Стиль [EmbeddedChip] размера L
 */
val EmbeddedChip.L: ChipStyleBuilder
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
                endContentMargin = 10.dp,
                startPadding = 16.dp,
                endPadding = 12.dp,
            ),
        )

/**
 * Стиль [EmbeddedChip] размера M
 */
val EmbeddedChip.M: ChipStyleBuilder
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
                endContentMargin = 8.dp,
                startPadding = 14.dp,
                endPadding = 10.dp,
            ),
        )

/**
 * Стиль [EmbeddedChip] размера S
 */
val EmbeddedChip.S: ChipStyleBuilder
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
                endContentMargin = 6.dp,
                startPadding = 12.dp,
                endPadding = 8.dp,
            ),
        )

/**
 * Стиль [EmbeddedChip] размера Xs
 */
val EmbeddedChip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .shape(SddsServTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
        .dimensions(
            Chip.Dimensions(
                height = 20.dp,
                startContentSize = 12.dp,
                endContentSize = 12.dp,
                startContentMargin = 4.dp,
                endContentMargin = 4.dp,
                startPadding = 8.dp,
                endPadding = 4.dp,
            ),
        )

/**
 * Вариация [Chip] со скругленными на 50% углами (figma: Pilled)
 */
val ChipStyleBuilder.Pilled: ChipStyleBuilder
    get() = this.shape(CircleShape)

/**
 * Вариация [Chip] цвета Default
 */
val ChipStyleBuilder.Default: ChipStyleBuilder
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
        endContentColor(
            SddsServTheme.colors.textInverseSecondary.asInteractive(
                pressed = SddsServTheme.colors.textInverseSecondaryActive,
            ),
        )
    }

/**
 * Вариация [Chip] цвета Secondary
 */
val ChipStyleBuilder.Secondary: ChipStyleBuilder
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
        endContentColor(
            SddsServTheme.colors.textDefaultSecondary.asInteractive(
                pressed = SddsServTheme.colors.textDefaultSecondaryActive,
            ),
        )
    }

/**
 * Вариация [Chip] цвета Accent
 */
val ChipStyleBuilder.Accent: ChipStyleBuilder
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
        endContentColor(
            SddsServTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = SddsServTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }
