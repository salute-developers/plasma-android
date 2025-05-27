package com.sdds.playground.sandbox.modal.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ModalStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Modal
 */
internal class ModalViewModel(
    defaultState: ModalUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ModalUiState, ModalStyle>(defaultState, componentKey) {

    override fun ModalUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "useNativeBlackout",
                value = useNativeBlackout,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(useNativeBlackout = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasClose",
                value = hasClose,
                onApply = { internalUiState.value = internalUiState.value.copy(hasClose = it) },
            ),
        )
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
