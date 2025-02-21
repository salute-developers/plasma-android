package com.sdds.playground.sandbox.indicator.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Indicator
 * @property variant состояние компонента
 */
internal data class IndicatorUiState(
    override val variant: String = "",
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
