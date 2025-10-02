package com.sdds.playground.sandbox.card.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Card
 * @property variant состояние компонента
 */
internal data class CardUiState(
    override val variant: String = "",
    val orientation: Orientation = Orientation.VERTICAL,
    val label: String = "Title",

) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class Orientation {
    VERTICAL,
    HORIZONTAL,
}
