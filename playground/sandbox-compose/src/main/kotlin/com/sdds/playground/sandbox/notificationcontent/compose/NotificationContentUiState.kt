package com.sdds.playground.sandbox.notificationcontent.compose

import com.sdds.playground.sandbox.core.compose.UiState

internal data class NotificationContentUiState(
    override val variant: String = "",
    val title: String = "Title",
    val text: String = "Text",
    val hasActions: Boolean = true,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
