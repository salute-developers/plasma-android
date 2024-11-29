package com.sdds.plasma.sd.service.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.plasma.sd.service.tokens.compose.PlasmaSdServiceTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundM)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = (-2).dp))
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundS)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundS)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXxs)
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
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
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
            PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textInversePrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultActive,
            ),
        )
        endContentColor(
            PlasmaSdServiceTheme.colors.textInverseSecondary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textInverseSecondaryActive,
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
            PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive,
            ),
        )
        endContentColor(
            PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textDefaultSecondaryActive,
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
            PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            PlasmaSdServiceTheme.colors.surfaceDefaultAccent.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.surfaceDefaultAccentActive,
            ),
        )
        endContentColor(
            PlasmaSdServiceTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }
