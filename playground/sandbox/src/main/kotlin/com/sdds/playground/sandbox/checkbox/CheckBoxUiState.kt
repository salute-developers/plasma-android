package com.sdds.playground.sandbox.checkbox

import androidx.compose.ui.state.ToggleableState

/**
 * Состояние checkbox
 *
 * @property size размер checkbox [SandboxCheckBox.Size]
 * @property enabled включена ли кнопка
 */
internal data class CheckBoxUiState(
    val state: ToggleableState = ToggleableState.Indeterminate,
    val size: SandboxCheckBox.Size = SandboxCheckBox.Size.M,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)
