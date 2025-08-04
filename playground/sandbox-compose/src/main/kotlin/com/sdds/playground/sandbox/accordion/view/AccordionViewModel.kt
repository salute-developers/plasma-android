package com.sdds.playground.sandbox.accordion.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.accordion.AccordionUiState

internal class AccordionViewModel(
    defaultState: AccordionUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AccordionUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.ItemTitle -> currentState.copy(title = valueString)
            PropertyName.ItemContentText -> currentState.copy(contentText = valueString)
            PropertyName.HasDivider -> currentState.copy(hasDivider = valueString.toBoolean())
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
        }
    }

    override fun AccordionUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = PropertyName.Amount.value,
                value = amount,
            ),
            Property.StringProperty(
                name = PropertyName.ItemTitle.value,
                value = title,
            ),
            Property.StringProperty(
                name = PropertyName.ItemContentText.value,
                value = contentText,
            ),
            Property.BooleanProperty(
                name = PropertyName.HasDivider.value,
                value = hasDivider,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        ItemTitle("itemTitle"),
        ItemContentText("itemContentText"),
        HasDivider("hasDivider"),
    }
}

internal class AccordionViewModelFactory(
    private val defaultState: AccordionUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AccordionViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
