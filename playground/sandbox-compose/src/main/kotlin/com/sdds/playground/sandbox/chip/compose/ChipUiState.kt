package com.sdds.playground.sandbox.chip.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ChipUiState(
    override val variant: String = "",
    val isClickable: Boolean = true,
    val label: String = "Label",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
