package com.sdds.playground.sandbox.select.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import com.sdds.testing.vs.select.SelectUiState
import com.sdds.testing.vs.select.TriggerType
import com.sdds.uikit.Select

internal class SelectParametersViewModel(
    defaultState: SelectUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SelectUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = SelectProperties.values().find { it.value == name } ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            SelectProperties.ShowLoading -> currentState.copy(showLoading = valueString.toBoolean())
            SelectProperties.EmptyState -> currentState.copy(withEmptyState = valueString.toBoolean())
            SelectProperties.TriggerType -> currentState.copy(triggerType = TriggerType.valueOf(valueString))
            SelectProperties.TriggerAlignment -> currentState.copy(
                triggerAlignment = PopoverTriggerAlignment.valueOf(
                    valueString,
                ),
            )

            SelectProperties.DropdownPlacementMode -> currentState.copy(
                dropdownPlacementMode = PopoverPlacementMode.valueOf(
                    valueString,
                ),
            )
            SelectProperties.SelectionMode -> currentState.copy(
                selectionMode = Select.SelectionMode.valueOf(
                    valueString,
                ),
            )
            SelectProperties.Enabled -> currentState.copy(enabled = valueString.toBoolean())
            SelectProperties.ReadOnly -> currentState.copy(readOnly = valueString.toBoolean())
        }
    }

    override fun SelectUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = SelectProperties.ShowLoading.value,
                value = showLoading,
            ),

            Property.BooleanProperty(
                name = SelectProperties.EmptyState.value,
                value = withEmptyState,
            ),
            enumProperty(
                name = SelectProperties.TriggerType.value,
                value = triggerType,
            ),
            enumProperty(
                name = SelectProperties.TriggerAlignment.value,
                value = triggerAlignment,
            ),
            enumProperty(
                name = SelectProperties.DropdownPlacementMode.value,
                value = dropdownPlacementMode,
            ),
            enumProperty(
                name = SelectProperties.SelectionMode.value,
                value = selectionMode,
            ),
            Property.BooleanProperty(
                name = SelectProperties.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = SelectProperties.ReadOnly.value,
                value = readOnly,
            ),
        )
    }

    private enum class SelectProperties(val value: String) {
        ShowLoading("loading"),
        EmptyState("emptyState"),
        TriggerType("triggerType"),
        TriggerAlignment("triggerAlignment"),
        DropdownPlacementMode("dropdownPlacementMode"),
        SelectionMode("selectionMode"),
        Enabled("enabled"),
        ReadOnly("readOnly"),
    }
}

internal class SelectViewModelFactory(
    private val defaultState: SelectUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SelectParametersViewModel(defaultState, componentKey) as T
    }
}
