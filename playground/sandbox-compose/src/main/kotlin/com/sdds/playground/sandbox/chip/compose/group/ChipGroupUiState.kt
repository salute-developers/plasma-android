package com.sdds.playground.sandbox.chip.compose.group

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ChipGroupUiState(
    override val variant: String = "",
    val items: List<String> = List(3) { "label" },
    val shouldWrap: Boolean = true,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
