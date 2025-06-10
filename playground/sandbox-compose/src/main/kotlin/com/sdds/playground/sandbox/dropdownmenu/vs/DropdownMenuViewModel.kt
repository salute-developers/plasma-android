package com.sdds.playground.sandbox.dropdownmenu.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.dropdownmenu.DropdownMenuUiState
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment

internal class DropdownMenuViewModel(
    defaultState: DropdownMenuUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DropdownMenuUiState>(defaultState, componentKey) {

    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    override val colorVariantPropertyName: String
        get() = "itemColorState"

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PropertyName.ItemTitle -> currentState.copy(itemTitle = valueString)
            PropertyName.HasDisclosure -> currentState.copy(hasDisclosure = valueString.toBoolean())
            PropertyName.ItemDividerEnabled -> currentState.copy(itemDividerEnabled = valueString.toBoolean())
            PropertyName.Amount -> currentState.copy(amount = valueString.toIntOrNull() ?: 0)
            PropertyName.Placement -> currentState.copy(placement = PopoverPlacement.valueOf(valueString))
            PropertyName.PlacementMode -> currentState.copy(
                placementMode = PopoverPlacementMode.valueOf(valueString),
            )
            PropertyName.Alignment -> currentState.copy(alignment = PopoverAlignment.valueOf(valueString))
            PropertyName.TriggerAlignment -> currentState.copy(
                triggerAlignment = PopoverTriggerAlignment.valueOf(valueString),
            )
        }
    }

    override fun DropdownMenuUiState.toProps(): List<Property<*>> {
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
            Property.BooleanProperty(
                name = PropertyName.ItemDividerEnabled.value,
                value = itemDividerEnabled,
            ),
            enumProperty(
                name = PropertyName.PlacementMode.value,
                value = placementMode,
            ),
            enumProperty(
                name = PropertyName.Placement.value,
                value = placement,
            ),
            enumProperty(
                name = PropertyName.Alignment.value,
                value = alignment,
            ),
            enumProperty(
                name = PropertyName.TriggerAlignment.value,
                value = triggerAlignment,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Amount("amount"),
        ItemTitle("itemTitle"),
        HasDisclosure("hasDisclosure"),
        Placement("placement"),
        PlacementMode("placementMode"),
        Alignment("alignment"),
        TriggerAlignment("triggerAlignment"),
        ItemDividerEnabled("itemDividerEnabled"),
    }
}

internal class DropdownMenuViewModelFactory(
    private val defaultState: DropdownMenuUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DropdownMenuViewModel(
            defaultState = defaultState,
            componentKey = componentKey,
        ) as T
    }
}
