package com.sdds.playground.sandbox.divider.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние компонента Divider
 * @property variant вариант компонента
 */
internal data class DividerUiState(
    override val variant: String = "",
    override val appearance: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
