package com.sdds.playground.sandbox.autocomplete

import com.sdds.playground.sandbox.core.compose.UiState

internal data class AutocompleteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val showLoading: Boolean = false,
    val withEmptyState: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
