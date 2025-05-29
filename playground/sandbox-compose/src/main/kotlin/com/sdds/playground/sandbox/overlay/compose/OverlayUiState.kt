package com.sdds.playground.sandbox.overlay.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Overlay
 * @property variant вариант компонента
 */
internal data class OverlayUiState(
    override val variant: String = "",
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
