package com.sdds.playground.sandbox.notification.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.notification.NotificationUiState
import com.sdds.uikit.overlays.OverlayPosition

internal class NotificationViewModel(
    defaultState: NotificationUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NotificationUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = NotificationPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            NotificationPropertyName.Position -> currentState.copy(position = OverlayPosition.valueOf(valueString))
            NotificationPropertyName.AutoDismiss -> currentState.copy(autoDismiss = valueString.toBoolean())
            NotificationPropertyName.Focusable -> currentState.copy(focusable = valueString.toBoolean())
            NotificationPropertyName.Text -> currentState.copy(text = valueString)
            else -> currentState
        }
    }

    override fun NotificationUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = NotificationPropertyName.Position.value,
                value = position,
            ),
            Property.StringProperty(
                name = NotificationPropertyName.Text.value,
                value = text,
            ),
            Property.BooleanProperty(
                name = NotificationPropertyName.AutoDismiss.value,
                value = autoDismiss,
            ),
            Property.BooleanProperty(
                name = NotificationPropertyName.Focusable.value,
                value = focusable,
            ),
        )
    }

    private enum class NotificationPropertyName(val value: String) {
        Position("position"),
        Text("text"),
        AutoDismiss("autoDismiss"),
        Focusable("focusable"),
    }
}

internal class ToastViewModelFactory(
    private val defaultState: NotificationUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NotificationViewModel(defaultState, componentKey) as T
    }
}
