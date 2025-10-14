package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.ui.text.input.TextFieldValue
import com.sdds.playground.sandbox.core.compose.UiState

internal data class TextFieldUiState(
    val textFieldValue: TextFieldValue = TextFieldValue("Value"),
    override val variant: String = "",
    override val appearance: String = "",
    val labelText: String = "Label",
    val optionalText: String = "Optional",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val chips: List<String> = emptyList(),
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
