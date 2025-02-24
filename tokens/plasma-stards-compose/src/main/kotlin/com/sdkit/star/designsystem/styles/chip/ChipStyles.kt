package com.sdkit.star.designsystem.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.EmbeddedChip
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdkit.star.designsystem.R
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .shape(StarDsTheme.shapes.roundM)
        .dimensions(
            Chip.Dimensions(
                height = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_min_height),
                startContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_content_size),
                endContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_content_size),
                startContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_start_content_margin),
                endContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_end_content_margin),
                startPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_padding_start),
                endPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_l_padding_end),
            ),
        )

/**
 * Стиль [Chip] размера M
 */
val Chip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .shape(StarDsTheme.shapes.roundM.adjustBy(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_shape_adjustment)))
        .dimensions(
            Chip.Dimensions(
                height = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_min_height),
                startContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_content_size),
                endContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_content_size),
                startContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_start_content_margin),
                endContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_end_content_margin),
                startPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_padding_start),
                endPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_m_padding_end),
            ),
        )

/**
 * Стиль [Chip] размера S
 */
val Chip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .shape(StarDsTheme.shapes.roundS)
        .dimensions(
            Chip.Dimensions(
                height = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_min_height),
                startContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_content_size),
                endContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_content_size),
                startContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_start_content_margin),
                endContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_end_content_margin),
                startPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_padding_start),
                endPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_s_padding_end),
            ),
        )

/**
 * Стиль [Chip] размера Xs
 */
val Chip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions(
            Chip.Dimensions(
                height = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_min_height),
                startContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_content_size),
                endContentSize = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_content_size),
                startContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_start_content_margin),
                endContentMargin = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_end_content_margin),
                startPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_padding_start),
                endPadding = dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_padding_end),
            ),
        )

/**
 * Стиль [EmbeddedChip] размера L
 */
val EmbeddedChip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .shape(StarDsTheme.shapes.roundS)
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
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .shape(StarDsTheme.shapes.roundXs)
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
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .shape(StarDsTheme.shapes.roundXxs)
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
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .shape(StarDsTheme.shapes.roundXxs.adjustBy(all = (-2).dp))
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
            StarDsTheme.colors.textDefaultPrimary.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.textDefaultPrimaryActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.textInversePrimaryActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.textInversePrimary,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.surfaceDefaultTransparentSecondaryActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.surfaceDefaultSolidDefault,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textDefaultSecondary.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.textDefaultSecondaryActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.textInverseSecondaryActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.textInverseSecondary,
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
            StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.textOnDarkPrimaryActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.textInversePrimaryActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.textInversePrimary,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultAccent.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.surfaceDefaultAccentActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.surfaceDefaultSolidDefault,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                setOf(InteractiveState.Pressed) to StarDsTheme.colors.textOnDarkSecondaryActive,
                setOf(
                    InteractiveState.Focused,
                    InteractiveState.Pressed,
                ) to StarDsTheme.colors.textInverseSecondaryActive,
                setOf(InteractiveState.Focused) to StarDsTheme.colors.textInverseSecondary,
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
            StarDsTheme.colors.textDefaultPrimary.asInteractive(
                pressed = StarDsTheme.colors.textDefaultPrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultTransparentSecondaryActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textDefaultSecondary.asInteractive(
                pressed = StarDsTheme.colors.textDefaultSecondaryActive,
            ),
        )
    }
