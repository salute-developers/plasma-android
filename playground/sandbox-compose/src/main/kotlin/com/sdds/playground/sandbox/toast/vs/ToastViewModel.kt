package com.sdds.playground.sandbox.toast.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.toast.ToastUiState
import com.sdds.uikit.overlays.OverlayPosition

internal class ToastViewModel(
    defaultState: ToastUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ToastUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = ToastPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            ToastPropertyName.Position -> currentState.copy(position = OverlayPosition.valueOf(valueString))
            ToastPropertyName.AutoDismiss -> currentState.copy(autoDismiss = valueString.toBoolean())
            ToastPropertyName.ContentStart -> currentState.copy(hasContentStart = valueString.toBoolean())
            ToastPropertyName.ContentEnd -> currentState.copy(hasContentEnd = valueString.toBoolean())
            ToastPropertyName.Text -> currentState.copy(text = valueString)
            else -> currentState
        }
    }

    override fun ToastUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = ToastPropertyName.Position.value,
                value = position,
            ),
            Property.StringProperty(
                name = ToastPropertyName.Text.value,
                value = text,
            ),
            Property.BooleanProperty(
                name = ToastPropertyName.ContentStart.value,
                value = hasContentStart,
            ),
            Property.BooleanProperty(
                name = ToastPropertyName.ContentEnd.value,
                value = hasContentEnd,
            ),
            Property.BooleanProperty(
                name = ToastPropertyName.AutoDismiss.value,
                value = autoDismiss,
            ),
        )
    }

    private enum class ToastPropertyName(val value: String) {
        Position("position"),
        Text("text"),
        ContentStart("hasContentStart"),
        ContentEnd("hasContentEnd"),
        AutoDismiss("autoDismiss"),
    }
}

internal class ToastViewModelFactory(
    private val defaultState: ToastUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ToastViewModel(defaultState, componentKey) as T
    }
}
