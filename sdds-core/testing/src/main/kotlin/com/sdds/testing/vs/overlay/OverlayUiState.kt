package com.sdds.testing.vs.overlay

import com.sdds.testing.vs.UiState

/**
 * Состояние компонент Overlay
 * @property variant вариация
 */
data class OverlayUiState(
    override val variant: String = "",
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
