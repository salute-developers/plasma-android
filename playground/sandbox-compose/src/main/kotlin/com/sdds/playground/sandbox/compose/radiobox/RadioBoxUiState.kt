package com.sdds.playground.sandbox.radiobox

/**
 * Состояние radiobox
 *
 * @property checked состояние radiobox
 * @property size размер radiobox [SandboxRadioBox.Size]
 * @property label текст лэйбла
 * @property description текст описания
 * @property enabled включен ли radiobox
 */
internal data class RadioBoxUiState(
    val checked: Boolean = false,
    val size: SandboxRadioBox.Size = SandboxRadioBox.Size.M,
    val label: String? = "Label",
    val description: String? = "Description",
    val enabled: Boolean = true,
)
