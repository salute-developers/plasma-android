package com.sdds.playground.sandbox.tabs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.tabs.DisplayMode
import com.sdds.testing.vs.tabs.TabItemIcon
import com.sdds.testing.vs.tabs.TabsUiState

internal class TabsViewModel(
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
        var counter = currentState.counter
        var icon = currentState.icon
        internalUiState.value = when (propertyName) {
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
            PropertyName.Icon -> currentState.copy(
                icon = when {
                    valueString == TabItemIcon.Start::class.simpleName -> TabItemIcon.Start
                    valueString == TabItemIcon.End::class.simpleName && counter -> {
                        counter = false
                        TabItemIcon.End
                    }
                    valueString == TabItemIcon.End::class.simpleName && !counter -> {
                        TabItemIcon.End
                    }
                    else -> TabItemIcon.No
                },
                counter = counter,
            )

            PropertyName.Label -> currentState.copy(tabItemLabel = valueString)
            PropertyName.Value -> currentState.copy(tabItemValue = valueString)
            PropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
            PropertyName.ActionEnabled -> currentState.copy(actionEnabled = valueString.toBoolean())
            PropertyName.DividerEnabled -> currentState.copy(dividerEnabled = valueString.toBoolean())
            PropertyName.DisplayMode -> currentState.copy(displayMode = DisplayMode.valueOf(valueString))

            PropertyName.Counter -> {
                if (currentState.icon == TabItemIcon.End) icon = TabItemIcon.No
                counter = valueString.toBoolean()
                currentState.copy(counter = counter, icon = icon)
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

            Property.SingleChoiceProperty(
                name = PropertyName.Icon.value,
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    TabItemIcon.Start::class.simpleName.orEmpty(),
                    TabItemIcon.End::class.simpleName.orEmpty(),
                    TabItemIcon.No::class.simpleName.orEmpty(),
                ),
            ),
            Property.StringProperty(
                name = PropertyName.Label.value,
                value = tabItemLabel,
            ),
            Property.StringProperty(
                name = PropertyName.Value.value,
                value = tabItemValue.orEmpty(),
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
        Icon("icon"),
        Label("label"),
        Value("value"),
        Enabled("enabled"),
        ActionEnabled("hasAction"),
        DividerEnabled("hasDivider"),
        DisplayMode("displayMode"),
        Counter("hasExtra"),
        Count("count"),
    }
}

internal class TabsViewModelFactory(
    private val defaultState: TabsUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TabsViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
