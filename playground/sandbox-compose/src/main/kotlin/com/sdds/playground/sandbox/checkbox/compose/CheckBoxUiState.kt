package com.sdds.playground.sandbox.checkbox.compose

import androidx.compose.ui.state.ToggleableState
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние checkbox
 *
 * @property state состояние checkbox
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
internal data class CheckBoxUiState(
    override val variant: String = "",
    val state: ToggleableState = ToggleableState.Indeterminate,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

internal fun ToggleableState.toggle(): ToggleableState {
    return if (this == ToggleableState.Off || this == ToggleableState.Indeterminate) {
        ToggleableState.On
    } else {
        ToggleableState.Off
    }
}
