package com.sdds.playground.sandbox.counter.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние Counter
 * @property count текст
 */
internal data class CounterUiState(
    override val variant: String = "",
    val count: String = "1",
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
