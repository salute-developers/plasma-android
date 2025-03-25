package com.sdds.plasma.giga.styles.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ChipGroupDimensions
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder

/**
 * Стиль [ChipGroup] с большими отступами
 */
val ChipGroup.Wide: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
        .dimensions(
            ChipGroupDimensions(
                horizontalSpacing = 8.dp,
                verticalSpacing = 8.dp,
            ),
        )

/**
 * Стиль [ChipGroup] с маленькими отступами
 */
val ChipGroup.Dense: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
        .dimensions(ChipGroupDimensions())
