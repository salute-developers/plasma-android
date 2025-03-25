package com.sdkit.star.designsystem.styles.chip

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.ChipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme

/**
 * Стиль [Chip] размера L
 */
val Chip.L: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            height(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_min_height))
            startContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_content_size))
            endContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_content_size))
            startContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_start_content_margin))
            endContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_end_content_margin))
            startPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_padding_start))
            endPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_l_padding_end))
        }

/**
 * Стиль [Chip] размера M
 */
val Chip.M: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .shape(StarDsTheme.shapes.roundM.adjustBy(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_shape_adjustment)))
        .dimensions {
            height(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_min_height))
            startContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_content_size))
            endContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_content_size))
            startContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_start_content_margin))
            endContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_end_content_margin))
            startPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_padding_start))
            endPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_m_padding_end))
        }

/**
 * Стиль [Chip] размера S
 */
val Chip.S: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            height(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_min_height))
            startContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_content_size))
            endContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_content_size))
            startContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_start_content_margin))
            endContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_end_content_margin))
            startPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_padding_start))
            endPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_s_padding_end))
        }

/**
 * Стиль [Chip] размера Xs
 */
val Chip.Xs: ChipStyleBuilder
    @Composable
    get() = ChipStyle.builder()
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .shape(StarDsTheme.shapes.roundXs)
        .dimensions {
            height(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_min_height))
            startContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_content_size))
            endContentSize(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_content_size))
            startContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_start_content_margin))
            endContentMargin(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_end_content_margin))
            startPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_padding_start))
            endPadding(dimensionResource(id = R.dimen.sdkit_cmp_chip_xs_padding_end))
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
            StarDsTheme.colors.textInversePrimary.asInteractive(
                pressed = StarDsTheme.colors.textInversePrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultSolidDefaultActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textInverseSecondary.asInteractive(
                pressed = StarDsTheme.colors.textInverseSecondaryActive,
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

/**
 * Вариация [Chip] цвета Accent
 */
val ChipStyleBuilder.Accent: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultAccent.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultAccentActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }

/**
 * Вариация [Chip] цвета Positive
 */
val ChipStyleBuilder.Positive: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultPositive.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultPositiveActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }

/**
 * Вариация [Chip] цвета Warning
 */
val ChipStyleBuilder.Warning: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultWarning.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultWarningActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }

/**
 * Вариация [Chip] цвета Negative
 */
val ChipStyleBuilder.Negative: ChipStyleBuilder
    @Composable
    get() = this.colors {
        contentColor(
            StarDsTheme.colors.textOnDarkPrimary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkPrimaryActive,
            ),
        )
        backgroundColor(
            StarDsTheme.colors.surfaceDefaultNegative.asInteractive(
                pressed = StarDsTheme.colors.surfaceDefaultNegativeActive,
            ),
        )
        endContentColor(
            StarDsTheme.colors.textOnDarkSecondary.asInteractive(
                pressed = StarDsTheme.colors.textOnDarkSecondaryActive,
            ),
        )
    }
