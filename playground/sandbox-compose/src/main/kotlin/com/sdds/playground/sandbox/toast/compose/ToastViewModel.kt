package com.sdds.playground.sandbox.toast.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ToastStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Toast
 */
internal class ToastViewModel(
    defaultState: ToastUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ToastUiState, ToastStyle>(defaultState, componentKey) {

    override fun ToastUiState.toProps(): List<Property<*>> {
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
                name = "hasContentStart",
                value = hasContentStart,
                onApply = { internalUiState.value = internalUiState.value.copy(hasContentStart = it) },
            ),
            Property.BooleanProperty(
                name = "hasContentEnd",
                value = hasContentEnd,
                onApply = { internalUiState.value = internalUiState.value.copy(hasContentEnd = it) },
            ),
            Property.BooleanProperty(
                name = "autoDismiss",
                value = autoDismiss,
                onApply = { internalUiState.value = internalUiState.value.copy(autoDismiss = it) },
            ),
        )
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
