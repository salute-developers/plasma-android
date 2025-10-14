package com.sdds.playground.sandbox.image.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Image
 * @property variant стиль компонента
 */
internal data class ImageUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
