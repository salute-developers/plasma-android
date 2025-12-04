package com.sdds.playground.sandbox.autocomplete.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.autocomplete.AutocompleteUiState
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment

internal class AutocompleteViewModel(
    defaultState: AutocompleteUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AutocompleteUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = AutocompleteProperties.values().find { it.value == name } ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            AutocompleteProperties.ShowLoading -> currentState.copy(showLoading = valueString.toBoolean())
            AutocompleteProperties.EmptyState -> currentState.copy(withEmptyState = valueString.toBoolean())
            AutocompleteProperties.FieldAlignment -> currentState.copy(
                fieldAlignment = PopoverTriggerAlignment.valueOf(
                    valueString,
                ),
            )

            AutocompleteProperties.DropdownPlacementMode -> currentState.copy(
                dropdownPlacementMode = PopoverPlacementMode.valueOf(
                    valueString,
                ),
            )
        }
    }

    override fun AutocompleteUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = AutocompleteProperties.ShowLoading.value,
                value = showLoading,
            ),

            Property.BooleanProperty(
                name = AutocompleteProperties.EmptyState.value,
                value = withEmptyState,
            ),
            enumProperty(
                name = AutocompleteProperties.FieldAlignment.value,
                value = fieldAlignment,
            ),
            enumProperty(
                name = AutocompleteProperties.DropdownPlacementMode.value,
                value = dropdownPlacementMode,
            ),
        )
    }

    private enum class AutocompleteProperties(val value: String) {
        ShowLoading("loading"),
        EmptyState("emptyState"),
        FieldAlignment("fieldAlignment"),
        DropdownPlacementMode("dropdownPlacementMode"),
    }
}

internal class AutocompleteViewModelFactory(
    private val defaultState: AutocompleteUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AutocompleteViewModel(defaultState, componentKey) as T
    }
}
