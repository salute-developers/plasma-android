package com.sdds.playground.sandbox.buttongroup.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента ButtonGroup
 */
internal class ButtonGroupViewModel(
    defaultState: ButtonGroupUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ButtonGroupUiState, ButtonGroupStyle>(defaultState, componentKey) {

    override fun ButtonGroupUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = {
                    if (it in 1..10) internalUiState.value = internalUiState.value.copy(amount = it)
                },
            ),
            enumProperty(
                name = "orientation",
                value = orientation,
                onApply = { internalUiState.value = internalUiState.value.copy(orientation = it) },
            ),
        )
    }
}

internal class ButtonGroupViewModelFactory(
    private val defaultState: ButtonGroupUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ButtonGroupViewModel(defaultState, componentKey) as T
    }
}
