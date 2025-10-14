package com.sdds.testing.vs.overlay

import com.sdds.testing.vs.UiState

/**
 * Состояние компонент Overlay
 * @property variant вариация
 */
data class OverlayUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
