package com.sdds.playground.sandbox.counter.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние Counter
 * @property count текст
 */
internal data class CounterUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val count: String = "1",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
