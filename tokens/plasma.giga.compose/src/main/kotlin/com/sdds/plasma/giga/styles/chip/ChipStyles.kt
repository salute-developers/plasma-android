package com.sdds.plasma.giga.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.giga.theme.PlasmaGigaTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .shape(PlasmaGigaTheme.shapes.roundM)
        .dimensions {
            height(48.dp)
            startContentSize(24.dp)
            endContentSize(24.dp)
            startContentMargin(8.dp)
            endContentMargin(8.dp)
            startPadding(16.dp)
            endPadding(16.dp)
        }

/**
 * Стиль [Chip] размера M
 */
val Chip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = (-2).dp))
        .dimensions {
            height(40.dp)
            startContentSize(24.dp)
            endContentSize(24.dp)
            startContentMargin(6.dp)
            endContentMargin(6.dp)
            startPadding(14.dp)
            endPadding(14.dp)
        }

/**
 * Стиль [Chip] размера S
 */
val Chip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .shape(PlasmaGigaTheme.shapes.roundS)
        .dimensions {
            height(32.dp)
            startContentSize(16.dp)
            endContentSize(16.dp)
            startContentMargin(4.dp)
            endContentMargin(4.dp)
            startPadding(12.dp)
            endPadding(12.dp)
        }

/**
 * Стиль [Chip] размера Xs
 */
val Chip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .shape(PlasmaGigaTheme.shapes.roundXs)
        .dimensions {
            height(24.dp)
            startContentSize(12.dp)
            endContentSize(12.dp)
            startContentMargin(2.dp)
            endContentMargin(2.dp)
            startPadding(10.dp)
            endPadding(10.dp)
        }

/**
 * Стиль [EmbeddedChip] размера L
 */
val EmbeddedChip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .shape(PlasmaGigaTheme.shapes.roundS)
        .dimensions {
            height(44.dp)
            startContentSize(24.dp)
            endContentSize(24.dp)
            startContentMargin(8.dp)
            endContentMargin(10.dp)
            startPadding(16.dp)
            endPadding(12.dp)
        }

/**
 * Стиль [EmbeddedChip] размера M
 */
val EmbeddedChip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .shape(PlasmaGigaTheme.shapes.roundXs)
        .dimensions {
            height(36.dp)
            startContentSize(24.dp)
            endContentSize(24.dp)
            startContentMargin(6.dp)
            endContentMargin(8.dp)
            startPadding(14.dp)
            endPadding(10.dp)
        }

/**
 * Стиль [EmbeddedChip] размера S
 */
val EmbeddedChip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodySNormal)
        .shape(PlasmaGigaTheme.shapes.roundXxs)
        .dimensions {
            height(28.dp)
            startContentSize(16.dp)
            endContentSize(16.dp)
            startContentMargin(4.dp)
            endContentMargin(6.dp)
            startPadding(12.dp)
            endPadding(8.dp)
        }

/**
 * Стиль [EmbeddedChip] размера Xs
 */
val EmbeddedChip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .shape(PlasmaGigaTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
        .dimensions {
            height(20.dp)
            startContentSize(12.dp)
            endContentSize(12.dp)
            startContentMargin(4.dp)
            endContentMargin(4.dp)
            startPadding(8.dp)
            endPadding(4.dp)
        }

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
            PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textInversePrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaGigaTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                pressed = PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
            ),
        )
        endContentColor(
            PlasmaGigaTheme.colors.textInverseSecondary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textInverseSecondaryActive,
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
            PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textDefaultPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                pressed = PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryActive,
            ),
        )
        endContentColor(
            PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textDefaultSecondaryActive,
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
            PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                pressed = PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
            ),
        )
        endContentColor(
            PlasmaGigaTheme.colors.textInverseSecondary.asInteractive(
                pressed = PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }
