package com.sdds.testing.vs.notification

import com.sdds.testing.vs.UiState
import com.sdds.uikit.overlays.OverlayPosition

/**
 * Состояние компонента Notification
 * @property variant вариация
 * @property text текстовое сообщение
 * @property position положение Notification
 * @property autoDismiss автоматическое скрытие Notification
 * @property focusable может ли Notification быть в фокусе
 * @property hasClose отображается ли кнопка закрытия
 * @property hasAnimation включает/выключает анимацию
 */
data class NotificationUiState(
    override val variant: String = "",
    val text: String = "Notification Text",
    val position: OverlayPosition = OverlayPosition.BottomEnd,
    val autoDismiss: Boolean = false,
    val focusable: Boolean = false,
    val hasClose: Boolean = true,
    val hasAnimation: Boolean = true,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
