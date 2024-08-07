package com.sdds.playground.sandbox.textfield

import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge

internal data class TextFieldUiState(
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    val state: SandboxTextField.State = SandboxTextField.State.Default,
    val size: SandboxTextField.Size = SandboxTextField.Size.L,
    val labelType: TextField.LabelType = TextField.LabelType.Outer,
    val labelText: String = "Label",
    val labelOptionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val hasDotBadge: Boolean = false,
    val dotBadgePosition: DotBadge.Position = DotBadge.Position.End,
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
)
