package com.sdds.plasma.b2c.sandbox.chip.group

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.plasma.b2c.sandbox.chip.Size
import com.sdds.plasma.b2c.styles.Dense
import com.sdds.plasma.b2c.styles.Wide

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
