package com.sdds.playground.sandbox.card.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Card
 * @property variant состояние компонента
 */
internal data class CardUiState(
    override val variant: String = "",
    val orientation: CardOrientation = CardOrientation.VERTICAL,

) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal enum class CardOrientation {
    VERTICAL,
    HORIZONTAL,
}
