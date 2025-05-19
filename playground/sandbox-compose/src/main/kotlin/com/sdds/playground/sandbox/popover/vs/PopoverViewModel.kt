package com.sdds.playground.sandbox.popover.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.popover.PopoverAlignment
import com.sdds.testing.vs.popover.PopoverPlacement
import com.sdds.testing.vs.popover.PopoverPlacementMode
import com.sdds.testing.vs.popover.PopoverTriggerAlignment
import com.sdds.testing.vs.popover.PopoverUiState

/**
 * ViewModel компонента Popover
 * @author Малышев Александр on 19.05.2025
 */
internal class PopoverViewModel(
    defaultState: PopoverUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<PopoverUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = PopoverPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            PopoverPropertyName.Placement -> currentState.copy(placement = PopoverPlacement.valueOf(valueString))
            PopoverPropertyName.PlacementMode -> currentState.copy(
                placementMode = PopoverPlacementMode.valueOf(valueString),
            )
            PopoverPropertyName.Alignment -> currentState.copy(alignment = PopoverAlignment.valueOf(valueString))
            PopoverPropertyName.TriggerCentered -> currentState.copy(triggerCentered = valueString.toBoolean())
            PopoverPropertyName.TriggerAlignment -> currentState.copy(
                triggerAlignment = PopoverTriggerAlignment.valueOf(valueString),
            )
            PopoverPropertyName.TailEnabled -> currentState.copy(tailEnabled = valueString.toBoolean())
            PopoverPropertyName.AutoDismiss -> currentState.copy(autoDismiss = valueString.toBoolean())
            else -> currentState
        }
    }

    override fun PopoverUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = PopoverPropertyName.PlacementMode.value,
                value = placementMode,
            ),
            enumProperty(
                name = PopoverPropertyName.Placement.value,
                value = placement,
            ),
            enumProperty(
                name = PopoverPropertyName.Alignment.value,
                value = alignment,
            ),
            enumProperty(
                name = PopoverPropertyName.TriggerAlignment.value,
                value = triggerAlignment,
            ),
            Property.BooleanProperty(
                name = PopoverPropertyName.TailEnabled.value,
                value = tailEnabled,
            ),
            Property.BooleanProperty(
                name = PopoverPropertyName.TriggerCentered.value,
                value = triggerCentered,
            ),
            Property.BooleanProperty(
                name = PopoverPropertyName.AutoDismiss.value,
                value = autoDismiss,
            ),
        )
    }

    private enum class PopoverPropertyName(val value: String) {
        Placement("placement"),
        PlacementMode("placementMode"),
        Alignment("alignment"),
        TriggerCentered("triggerCentered"),
        TriggerAlignment("triggerAlignment"),
        TailEnabled("tailEnabled"),
        AutoDismiss("autoDismiss"),
    }
}

/**
 * Фабрика для [PopoverViewModel]
 */
internal class PopoverViewModelFactory(
    private val defaultState: PopoverUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PopoverViewModel(defaultState, componentKey) as T
    }
}
