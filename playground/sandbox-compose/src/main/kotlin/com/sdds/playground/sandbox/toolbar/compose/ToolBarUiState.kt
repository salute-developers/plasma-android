package com.sdds.playground.sandbox.toolbar.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ToolBarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val hasDivider: Boolean = true,
    val sections: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
