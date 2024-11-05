package com.sdds.plasma.b2c.styles

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.b2c.tokens.compose.PlasmaB2cTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .shape(PlasmaB2cTheme.shapes.roundM)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .shape(PlasmaB2cTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
        .labelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .shape(PlasmaB2cTheme.shapes.roundS)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .shape(PlasmaB2cTheme.shapes.roundXs)
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
        .labelStyle(PlasmaB2cTheme.typography.bodyLNormal)
        .shape(PlasmaB2cTheme.shapes.roundS)
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

/**
 * Стиль [EmbeddedChip] размера M
 */
val EmbeddedChip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodyMNormal)
        .shape(PlasmaB2cTheme.shapes.roundXs)
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

/**
 * Стиль [EmbeddedChip] размера S
 */
val EmbeddedChip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodySNormal)
        .shape(PlasmaB2cTheme.shapes.roundXxs)
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

/**
 * Стиль [EmbeddedChip] размера Xs
 */
val EmbeddedChip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaB2cTheme.typography.bodyXsNormal)
        .shape(PlasmaB2cTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
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
            PlasmaB2cTheme.colors.textInversePrimary.asInteractive(
                pressed = PlasmaB2cTheme.colors.textInversePrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaB2cTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                pressed = PlasmaB2cTheme.colors.surfaceDefaultSolidDefaultActive,
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
            PlasmaB2cTheme.colors.textDefaultPrimary.asInteractive(
                pressed = PlasmaB2cTheme.colors.textDefaultPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                pressed = PlasmaB2cTheme.colors.surfaceDefaultTransparentSecondaryActive,
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
            PlasmaB2cTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = PlasmaB2cTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaB2cTheme.colors.surfaceDefaultAccent.asInteractive(
                pressed = PlasmaB2cTheme.colors.surfaceDefaultAccentActive,
            ),
        )
    }
