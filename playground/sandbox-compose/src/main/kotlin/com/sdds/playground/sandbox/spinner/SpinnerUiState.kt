package com.sdds.playground.sandbox.spinner

import com.sdds.playground.sandbox.core.compose.UiState

internal data class SpinnerUiState(
    override val variant: String = "",
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
