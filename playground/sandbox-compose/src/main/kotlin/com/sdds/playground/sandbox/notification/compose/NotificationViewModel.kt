package com.sdds.playground.sandbox.notification.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Notification
 */
internal class NotificationViewModel(
    defaultState: NotificationUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NotificationUiState, NotificationStyle>(defaultState, componentKey) {

    override fun NotificationUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "text",
                value = text,
                onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
            ),
            enumProperty(
                name = "posittion",
                value = position,
                onApply = { internalUiState.value = internalUiState.value.copy(position = it) },
            ),
            Property.BooleanProperty(
                name = "hasClose",
                value = hasClose,
                onApply = { internalUiState.value = internalUiState.value.copy(hasClose = it) },
            ),
            Property.BooleanProperty(
                name = "focusable",
                value = focusable,
                onApply = { internalUiState.value = internalUiState.value.copy(focusable = it) },
            ),
        )
    }
}

internal class NotificationViewModelFactory(
    private val defaultState: NotificationUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NotificationViewModel(defaultState, componentKey) as T
    }
}
