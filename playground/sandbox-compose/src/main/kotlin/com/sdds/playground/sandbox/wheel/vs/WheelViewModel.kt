package com.sdds.playground.sandbox.wheel.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.wheel.WheelSeparatorType
import com.sdds.testing.vs.wheel.WheelUiState

internal class WheelViewModel(
    defaultState: WheelUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<WheelUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val propertyName = PropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.ItemLabel -> currentState.copy(itemLabel = valueString)
            PropertyName.Description -> currentState.copy(description = valueString)
            PropertyName.ItemTextAfter -> currentState.copy(itemTextAfter = valueString)
            PropertyName.HasControls -> currentState.copy(hasControls = valueString.toBoolean())
            PropertyName.WheelCount -> currentState.copy(wheelCount = valueString.toIntOrNull() ?: 0)
            PropertyName.VisibleItemsCount -> currentState.copy(visibleItemsCount = valueString.toIntOrNull() ?: 0)
            PropertyName.SeparatorType -> currentState.copy(separatorType = WheelSeparatorType.valueOf(valueString))
            PropertyName.HasInfiniteScroll -> currentState.copy(hasInfiniteScroll = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun WheelUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = PropertyName.ItemLabel.value,
                value = itemLabel,
            ),
            Property.StringProperty(
                name = PropertyName.Description.value,
                value = description,
            ),
            Property.StringProperty(
                name = PropertyName.ItemTextAfter.value,
                value = itemTextAfter,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasControls.value,
                value = hasControls,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasInfiniteScroll.value,
                value = hasInfiniteScroll,
            ),
            Property.IntProperty(
                name = PropertyName.WheelCount.value,
                value = wheelCount,
            ),
            Property.IntProperty(
                name = PropertyName.VisibleItemsCount.value,
                value = visibleItemsCount,
            ),
            enumProperty(
                name = PropertyName.SeparatorType.value,
                value = separatorType,
            ),

        )
    }

    private enum class PropertyName(val value: String) {
        ItemLabel("itemLabel"),
        Description("description"),
        ItemTextAfter("itemTextAfter"),
        ItemAlignment("itemAlignment"),
        HasControls("hasControls"),
        WheelCount("wheelCount"),
        VisibleItemsCount("visibleItemsCount"),
        SeparatorType("separatorType"),
        HasInfiniteScroll("hasInfiniteScroll"),
    }
}

/**
 * Фабрика для [WheelViewModel]
 */
internal class WheelViewModelFactory(
    private val defaultState: WheelUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return WheelViewModel(defaultState, componentKey) as T
    }
}
