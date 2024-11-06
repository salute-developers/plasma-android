package com.sdds.plasma.sd.service.sandbox.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.plasma.sd.service.sandbox.chip.Size
import com.sdds.plasma.sd.service.styles.Dense
import com.sdds.plasma.sd.service.styles.Wide

internal data class ChipGroupUiState(
    val items: List<String> = List(3) { "label" },
    val size: Size = Size.M,
    val gap: Gap = Gap.Dense,
    val shouldWrap: Boolean = true,
    val enabled: Boolean = true,
)

internal enum class Gap {
    Wide,
    Dense,
}

@Composable
internal fun ChipGroupUiState.chipGroupStyle(): ChipGroupStyle {
    return when (gap) {
        Gap.Wide -> ChipGroup.Wide
        Gap.Dense -> ChipGroup.Dense
    }.style()
}
