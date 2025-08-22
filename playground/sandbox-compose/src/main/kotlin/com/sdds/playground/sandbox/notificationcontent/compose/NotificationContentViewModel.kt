package com.sdds.playground.sandbox.notificationcontent.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента NotificationContent
 */
internal class NotificationContentViewModel(
    defaultState: NotificationContentUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NotificationContentUiState, NotificationContentStyle>(
    defaultState,
    componentKey,
) {

    override fun NotificationContentUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = { internalUiState.value = internalUiState.value.copy(title = it) },
            ),
            Property.StringProperty(
                name = "text",
                value = text,
                onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
            ),
            Property.BooleanProperty(
                name = "hasActions",
                value = hasActions,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasActions = it)
                },
            ),
        )
    }
}

internal class NotificationContentViewModelFactory(
    private val defaultState: NotificationContentUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NotificationContentViewModel(defaultState, componentKey) as T
    }
}
