package com.sdds.testing.vs.notificationcontent

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента NotificationContent
 * @property variant вариация
 * @property title заголовок уведомления
 * @property text текст уведомления
 * @property hasActions наличие кнопок
 */
@Parcelize
data class NotificationContentUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasActions: Boolean = true,
) : UiState, Parcelable {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
