package com.sdds.playground.sandbox.flow.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.flow.FlowAlignment
import com.sdds.testing.vs.flow.FlowArrangement
import com.sdds.testing.vs.flow.FlowOrientation
import com.sdds.testing.vs.flow.FlowUiState

/**
 * ViewModel компонента Flow
 * @author Малышев Александр on 13.08.2025
 */
internal class FlowViewModel(
    defaultState: FlowUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<FlowUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = FlowPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            FlowPropertyName.Arrangement -> currentState.copy(arrangement = FlowArrangement.valueOf(valueString))
            FlowPropertyName.Alignment -> currentState.copy(alignment = FlowAlignment.valueOf(valueString))
            FlowPropertyName.Orientation -> currentState.copy(orientation = FlowOrientation.valueOf(valueString))
            FlowPropertyName.ItemsPerLine -> currentState.copy(itemsPerLine = valueString.toIntOrNull() ?: 0)
            else -> currentState
        }
    }

    override fun FlowUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = FlowPropertyName.Arrangement.value,
                value = arrangement,
            ),
            enumProperty(
                name = FlowPropertyName.Alignment.value,
                value = alignment,
            ),
            enumProperty(
                name = FlowPropertyName.Orientation.value,
                value = orientation,
            ),
            Property.IntProperty(
                name = FlowPropertyName.ItemsPerLine.value,
                value = itemsPerLine,
            ),
        )
    }

    private enum class FlowPropertyName(val value: String) {
        Arrangement("arrangement"),
        Alignment("alignment"),
        Orientation("orientation"),
        ItemsPerLine("itemsPerLine"),
    }
}

/**
 * Фабрика для [FlowViewModel]
 */
internal class FlowViewModelFactory(
    private val defaultState: FlowUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FlowViewModel(defaultState, componentKey) as T
    }
}
