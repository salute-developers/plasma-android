package com.sdds.uikit.fixtures.stories.overlay

import com.sdds.uikit.fixtures.UiState

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
