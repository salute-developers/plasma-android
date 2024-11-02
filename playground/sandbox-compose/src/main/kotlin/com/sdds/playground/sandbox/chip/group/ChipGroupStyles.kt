package com.sdds.playground.sandbox.chip.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupDimensions
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.ChipGroupStyleBuilder
import com.sdds.playground.sandbox.chip.Default
import com.sdds.playground.sandbox.chip.M

/**
 *
 * @author Малышев Александр on 28.10.2024
 */
internal val ChipGroup.Wide: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
//        .chipStyle(Chip.M.Default.style())
        .dimensions(
            ChipGroupDimensions(
                horizontalSpacing = 8.dp,
                verticalSpacing = 8.dp,
            ),
        )

internal val ChipGroup.Dense: ChipGroupStyleBuilder
    @Composable
    get() = ChipGroupStyle.builder()
//        .chipStyle(Chip.M.Default.style())
        .dimensions(ChipGroupDimensions())
