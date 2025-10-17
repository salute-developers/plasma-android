package com.sdds.playground.sandbox.note.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class NoteUiState(
    override val variant: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasAction: Boolean = true,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
