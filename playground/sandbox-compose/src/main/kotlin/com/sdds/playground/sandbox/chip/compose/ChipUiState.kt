package com.sdds.playground.sandbox.chip.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ChipUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val isClickable: Boolean = true,
    val label: String = "Label",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
