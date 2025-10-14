package com.sdds.playground.sandbox.modal.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class ModalUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val useNativeBlackout: Boolean = false,
    val hasClose: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
