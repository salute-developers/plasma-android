package com.sdds.playground.sandbox.notificationcontent.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class NotificationContentUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasActions: Boolean = true,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
