package com.sdds.playground.sandbox.editable

import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.uikit.EditableIconPlacement
import com.sdds.playground.sandbox.core.compose.UiState

internal data class EditableUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val enabled: Boolean = true,
    val singleLine: Boolean = true,
    val readonly: Boolean = false,
    val iconPlacement: EditableIconPlacement = EditableIconPlacement.Relative,
    val textAlign: EditableTextAlign = EditableTextAlign.Start,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class EditableTextAlign(val align: TextAlign) {
    Center(TextAlign.Center),
    Start(TextAlign.Start),
    End(TextAlign.End),
}
