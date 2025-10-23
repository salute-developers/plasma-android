package com.sdds.playground.sandbox.note.compose

import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние Note и NoteCompact
 * @property title заголовок
 * @property text текст
 * @property hasAction наличие actions
 */
internal data class NoteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasAction: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
