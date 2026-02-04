package com.sdds.playground.sandbox.modal.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.modal.ModalGravity
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
            ModalProperty.HasDimBackground.value -> currentState.copy(hasDimBackground = valueString.toBoolean())
            ModalProperty.EdgeToEdge.value -> currentState.copy(edgeToEdge = valueString.toBoolean())
            ModalProperty.Gravity.value -> currentState.copy(gravity = ModalGravity.valueOf(valueString))
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
            Property.BooleanProperty(
                name = "hasDimBackground",
                value = hasDimBackground,
            ),
            Property.BooleanProperty(
                name = "edgeToEdge",
                value = edgeToEdge,
            ),
            enumProperty(
                name = "gravity",
                value = gravity,
            ),
        )
    }

    private enum class ModalProperty(val value: String) {
        HasClose("hasClose"),
        HasDimBackground("hasDimBackground"),
        EdgeToEdge("edgeToEdge"),
        Gravity("gravity"),
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
