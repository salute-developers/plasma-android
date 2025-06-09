package com.sdds.playground.sandbox.list.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.list.ListUiState

internal class ListViewModel(
    defaultState: ListUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ListUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.ItemTitle -> currentState.copy(itemTitle = valueString)
            PropertyName.HasDisclosure -> currentState.copy(hasDisclosure = valueString.toBoolean())
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
        }
    }

    override fun ListUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = PropertyName.Amount.value,
                value = amount,
            ),
            Property.StringProperty(
                name = PropertyName.ItemTitle.value,
                value = itemTitle,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasDisclosure.value,
                value = hasDisclosure,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        ItemTitle("itemTitle"),
        HasDisclosure("hasDisclosure"),
    }
}

internal class ListViewModelFactory(
    private val defaultState: ListUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
