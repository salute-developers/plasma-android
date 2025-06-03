package com.sdds.playground.sandbox.notification.compose

import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.playground.sandbox.core.compose.UiState

internal data class NotificationUiState(
    override val variant: String = "",
    val text: String = "Notification",
    val hasClose: Boolean = true,
    val focusable: Boolean = false,
    val autoDismiss: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
