package com.sdds.playground.sandbox.toolbar.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.toolbar.ToolBarUiState

/**
 * ViewModel компонента ToolBar
 */
internal class ToolBarViewModel(
    defaultState: ToolBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ToolBarUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (name) {
            ToolBarProperty.HasDivider.value -> currentState.copy(hasDivider = valueString.toBoolean())
            ToolBarProperty.SlotsAmount.value -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(slotsAmount = valueString.toInt())
            } else {
                currentState
            }
            else -> currentState
        }
    }

    override fun ToolBarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "hasDivider",
                value = hasDivider,
            ),
            Property.IntProperty(
                name = "slotsAmount",
                value = slotsAmount,
            ),
        )
    }

    private enum class ToolBarProperty(val value: String) {
        HasDivider("hasDivider"),
        SlotsAmount("slotsAmount"),
    }
}

internal class ToolBarViewModelFactory(
    private val defaultState: ToolBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ToolBarViewModel(defaultState, componentKey) as T
    }
}
