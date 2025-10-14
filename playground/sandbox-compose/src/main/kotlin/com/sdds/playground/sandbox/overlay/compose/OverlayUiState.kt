package com.sdds.playground.sandbox.overlay.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Overlay
 * @property variant вариант компонента
 */
internal data class OverlayUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
