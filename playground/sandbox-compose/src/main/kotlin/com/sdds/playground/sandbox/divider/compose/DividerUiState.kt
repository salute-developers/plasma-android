package com.sdds.playground.sandbox.divider.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Divider
 * @property variant вариант компонента
 */
internal data class DividerUiState(
    override val variant: String = "",
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
