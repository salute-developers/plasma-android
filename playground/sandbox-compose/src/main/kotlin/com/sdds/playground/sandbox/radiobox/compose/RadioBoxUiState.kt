package com.sdds.playground.sandbox.radiobox.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние radiobox
 *
 * @property checked состояние radiobox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли radiobox
 */
internal data class RadioBoxUiState(
    override val variant: String = "",
    val checked: Boolean = false,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
