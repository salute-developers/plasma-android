package com.sdds.playground.sandbox.textfield

import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextField

internal data class TextFieldUiState(
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    val state: SandboxTextField.State = SandboxTextField.State.Default,
    val size: SandboxTextField.Size = SandboxTextField.Size.L,
    val labelType: TextField.LabelType = TextField.LabelType.Outer,
    val fieldType: SandboxTextField.FieldType = SandboxTextField.FieldType.Required,
    val dotBadgePosition: TextField.DotBadge.Position = TextField.DotBadge.Position.End,
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val hasDotBadge: Boolean = false,
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val chips: List<String> = emptyList(),
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
)
