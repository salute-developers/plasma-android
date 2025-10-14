package com.sdds.playground.sandbox.notification.compose

import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.playground.sandbox.core.compose.UiState

internal data class NotificationUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Notification Text",
    val hasClose: Boolean = true,
    val focusable: Boolean = false,
    val autoDismiss: Boolean = true,
    val showId: Boolean = true,
    val position: OverlayPosition = OverlayPosition.BottomCenter,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
