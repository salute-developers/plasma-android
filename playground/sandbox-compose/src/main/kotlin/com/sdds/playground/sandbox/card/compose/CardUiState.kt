package com.sdds.playground.sandbox.card.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Card
 * @property variant состояние компонента
 */
internal data class CardUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val orientation: Orientation = Orientation.VERTICAL,
    val label: String = "Title",

) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class Orientation {
    VERTICAL,
    HORIZONTAL,
}
