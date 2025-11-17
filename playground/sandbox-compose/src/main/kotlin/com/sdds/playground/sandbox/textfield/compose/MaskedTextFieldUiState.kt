package com.sdds.playground.sandbox.textfield.compose

import com.sdds.compose.uikit.mask.TextFieldMaskMode
import com.sdds.playground.sandbox.core.compose.UiState

internal data class MaskedTextFieldUiState(
    val textFieldValue: String = "",
    override val variant: String = "",
    override val appearance: String = "",
    val mask: TextMask = TextMask.Phone,
    val maskDisplayMode: MaskDisplayMode = MaskDisplayMode.Always,
    val labelText: String = "Label",
    val placeholderText: String = "",
    val hasStartIcon: Boolean = true,
    val hasEndIcon: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val suffix: String = "",
    val prefix: String = "",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class TextMask {
    Phone,
    DateShort,
    DateLong,
    Time,
    Number,
}

internal enum class MaskDisplayMode(val mode: TextFieldMaskMode) {
    Always(TextFieldMaskMode.Always),
    OnInput(TextFieldMaskMode.OnInput),
}
