package com.sdds.playground.sandbox.image

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Image
 * @property variant стиль компонента
 */
internal data class ImageUiState(override val variant: String = "") : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
