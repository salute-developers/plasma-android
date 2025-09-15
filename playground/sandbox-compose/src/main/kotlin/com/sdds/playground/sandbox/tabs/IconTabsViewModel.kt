package com.sdds.playground.sandbox.tabs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.tabs.DisplayMode
import com.sdds.testing.vs.tabs.TabsUiState

internal class IconTabsViewModel(
    defaultState: TabsUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TabsUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
            PropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
            PropertyName.ActionEnabled -> currentState.copy(actionEnabled = valueString.toBoolean())
            PropertyName.DividerEnabled -> currentState.copy(dividerEnabled = valueString.toBoolean())
            PropertyName.DisplayMode -> currentState.copy(displayMode = DisplayMode.valueOf(valueString))

            PropertyName.Counter -> {
                currentState.copy(counter = valueString.toBoolean())
            }

            PropertyName.Count -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(count = valueString)
            } else {
                currentState
            }
        }
    }

    override fun TabsUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = PropertyName.Amount.value,
                value = amount,
            ),
            Property.BooleanProperty(
                name = PropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = PropertyName.ActionEnabled.value,
                value = actionEnabled,
            ),
            Property.BooleanProperty(
                name = PropertyName.DividerEnabled.value,
                value = dividerEnabled,
            ),
            enumProperty(
                name = PropertyName.DisplayMode.value,
                value = displayMode,
            ),
            Property.BooleanProperty(
                name = PropertyName.Counter.value,
                value = counter,
            ),
            Property.StringProperty(
                name = PropertyName.Count.value,
                value = count,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        Enabled("enabled"),
        ActionEnabled("hasAction"),
        DividerEnabled("hasDivider"),
        DisplayMode("displayMode"),
        Counter("hasExtra"),
        Count("count"),
    }
}

internal class IconTabsViewModelFactory(
    private val defaultState: TabsUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconTabsViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
