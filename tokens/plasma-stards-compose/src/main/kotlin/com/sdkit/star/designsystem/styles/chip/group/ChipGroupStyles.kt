package com.sdkit.star.designsystem.styles.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ChipGroupDimensions
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdkit.star.designsystem.compose.R

/**
 * Стиль [ChipGroup] с большими отступами
 */
val ChipGroup.Wide: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
        .dimensions(
            ChipGroupDimensions(
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_chip_group_wide_horizontal_spacing),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_chip_group_wide_vertical_spacing),
            ),
        )

/**
 * Стиль [ChipGroup] с маленькими отступами
 */
val ChipGroup.Dense: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
        .dimensions(
            ChipGroupDimensions(
                horizontalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_chip_group_dense_horizontal_spacing),
                verticalSpacing = dimensionResource(id = R.dimen.sdkit_cmp_chip_group_dense_vertical_spacing),
            ),
        )
