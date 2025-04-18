package com.sdds.playground.sandbox.switcher.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние switch
 *
 * @property active состояние switch
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли switch
 */
internal data class SwitchUiState(
    override val variant: String = "",
    val active: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
