package com.sdds.testing.vs.note

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента Note
 * @property variant вариация
 * @property title заголовок уведомления
 * @property text текст уведомления
 * @property hasAction наличие кнопок
 */
@Parcelize
data class NoteUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasAction: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
