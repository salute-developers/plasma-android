package com.sdds.playground.sandbox.checkbox

import androidx.compose.ui.state.ToggleableState

/**
 * Состояние checkbox
 *
 * @property state состояние checkbox
 * @property size размер checkbox [SandboxCheckBox.Size]
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли checkbox
 */
internal data class CheckBoxUiState(
    val state: ToggleableState = ToggleableState.Indeterminate,
    val size: SandboxCheckBox.Size = SandboxCheckBox.Size.M,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)
