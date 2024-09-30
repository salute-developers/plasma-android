package com.sdds.playground.sandbox.textfield

import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextField

internal data class TextFieldUiState(
    val singleLine: Boolean = true,
    val isClear: Boolean = false,
    val hasDivider: Boolean = true,
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    val state: SandboxTextField.State = SandboxTextField.State.Default,
    val size: SandboxTextField.Size = SandboxTextField.Size.L,
    val labelPlacement: TextField.LabelPlacement = TextField.LabelPlacement.Outer,
    val fieldType: SandboxTextField.FieldType = SandboxTextField.FieldType.Required,
    val indicatorPlacement: TextField.Indicator.Placement = TextField.Indicator.Placement.End,
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val hasIndicator: Boolean = false,
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val chips: List<String> = emptyList(),
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
)
