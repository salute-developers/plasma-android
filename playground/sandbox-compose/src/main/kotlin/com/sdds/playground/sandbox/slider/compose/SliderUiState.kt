package com.sdds.playground.sandbox.slider.compose

import com.sdds.playground.sandbox.core.compose.UiState


internal data class SliderUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
