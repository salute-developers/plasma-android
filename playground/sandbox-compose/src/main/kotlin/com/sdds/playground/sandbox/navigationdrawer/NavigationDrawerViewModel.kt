package com.sdds.playground.sandbox.navigationdrawer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.navigationdrawer.NavigationDrawerMode
import com.sdds.testing.vs.navigationdrawer.NavigationDrawerUiState

internal class NavigationDrawerViewModel(
    defaultState: NavigationDrawerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<NavigationDrawerUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.ItemLabel -> currentState.copy(itemLabel = valueString)
            PropertyName.CounterEnabled -> currentState.copy(counterEnabled = valueString.toBoolean())
            PropertyName.CounterText -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(counterText = valueString)
            } else {
                currentState
            }

            PropertyName.Amount -> currentState.copy(amount = valueString.toInt())
            PropertyName.Mode -> currentState.copy(mode = NavigationDrawerMode.valueOf(valueString))
            PropertyName.HasHeader -> currentState.copy(hasHeader = valueString.toBoolean())
            PropertyName.HasFooter -> currentState.copy(hasFooter = valueString.toBoolean())
        }
    }

    override fun NavigationDrawerUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = PropertyName.Amount.value,
                value = amount,
            ),
            Property.StringProperty(
                name = PropertyName.ItemLabel.value,
                value = itemLabel,
            ),
            enumProperty(
                name = PropertyName.Mode.value,
                value = mode,
            ),
            Property.BooleanProperty(
                name = PropertyName.CounterEnabled.value,
                value = counterEnabled,
            ),
            Property.StringProperty(
                name = PropertyName.CounterText.value,
                value = counterText,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasHeader.value,
                value = hasHeader,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasFooter.value,
                value = hasFooter,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        ItemLabel("label"),
        CounterEnabled("counterEnabled"),
        CounterText("counterText"),
        Mode("mode"),
        HasHeader("hasHeader"),
        HasFooter("hasFooter"),
    }
}

internal class NavigationDrawerViewModelFactory(
    private val defaultState: NavigationDrawerUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NavigationDrawerViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
