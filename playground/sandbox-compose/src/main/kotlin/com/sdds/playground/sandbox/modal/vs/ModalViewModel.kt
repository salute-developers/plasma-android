package com.sdds.playground.sandbox.modal.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.modal.ModalUiState

/**
 * ViewModel компонента Modal
 */
internal class ModalViewModel(
    defaultState: ModalUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ModalUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (name) {
            ModalProperty.HasClose.value -> currentState.copy(hasClose = valueString.toBoolean())
            ModalProperty.UseNativeBlackout.value -> currentState.copy(useNativeBlackout = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun ModalUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "useNativeBlackout",
                value = useNativeBlackout,
            ),
            Property.BooleanProperty(
                name = "hasClose",
                value = hasClose,
            ),
        )
    }

    private enum class ModalProperty(val value: String) {
        HasClose("hasClose"),
        UseNativeBlackout("useNativeBlackout"),
    }
}

internal class ModalViewModelFactory(
    private val defaultState: ModalUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ModalViewModel(defaultState, componentKey) as T
    }
}
