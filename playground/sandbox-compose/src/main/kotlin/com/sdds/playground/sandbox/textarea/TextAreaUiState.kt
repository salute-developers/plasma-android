package com.sdds.playground.sandbox.textarea

import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.LabelType

internal data class TextAreaUiState(
    val value: TextFieldValue = TextFieldValue("Value"),
    val state: SandboxTextArea.State = SandboxTextArea.State.Default,
    val size: SandboxTextArea.Size = SandboxTextArea.Size.L,
    val labelType: LabelType = LabelType.Outer,
    val fieldType: SandboxTextArea.FieldType = SandboxTextArea.FieldType.Required,
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val hasDotBadge: Boolean = false,
    val dotBadgePosition: TextField.DotBadge.Position = TextField.DotBadge.Position.End,
    val hasIcon: Boolean = true,
    val chips: List<String> = emptyList(),
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
)
