package com.sdds.playground.sandbox.tooltip.vs

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
import com.sdds.testing.vs.tooltip.TooltipUiState

/**
 * ViewModel компонента Tooltip
 * @author Малышев Александр on 19.05.2025
 */
internal class TooltipViewModel(
    defaultState: TooltipUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TooltipUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = TooltipPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            TooltipPropertyName.Placement -> currentState.copy(placement = PopoverPlacement.valueOf(valueString))
            TooltipPropertyName.PlacementMode -> currentState.copy(
                placementMode = PopoverPlacementMode.valueOf(valueString),
            )
            TooltipPropertyName.Alignment -> currentState.copy(alignment = PopoverAlignment.valueOf(valueString))
            TooltipPropertyName.TriggerCentered -> currentState.copy(triggerCentered = valueString.toBoolean())
            TooltipPropertyName.TriggerAlignment -> currentState.copy(
                triggerAlignment = PopoverTriggerAlignment.valueOf(valueString),
            )
            TooltipPropertyName.TailEnabled -> currentState.copy(tailEnabled = valueString.toBoolean())
            TooltipPropertyName.AutoDismiss -> currentState.copy(autoDismiss = valueString.toBoolean())
            TooltipPropertyName.ContentStart -> currentState.copy(contentStart = valueString.toBoolean())
            TooltipPropertyName.Text -> currentState.copy(text = valueString)
            else -> currentState
        }
    }

    override fun TooltipUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = TooltipPropertyName.PlacementMode.value,
                value = placementMode,
            ),
            enumProperty(
                name = TooltipPropertyName.Placement.value,
                value = placement,
            ),
            enumProperty(
                name = TooltipPropertyName.Alignment.value,
                value = alignment,
            ),
            enumProperty(
                name = TooltipPropertyName.TriggerAlignment.value,
                value = triggerAlignment,
            ),
            Property.BooleanProperty(
                name = TooltipPropertyName.TailEnabled.value,
                value = tailEnabled,
            ),
            Property.BooleanProperty(
                name = TooltipPropertyName.TriggerCentered.value,
                value = triggerCentered,
            ),
            Property.BooleanProperty(
                name = TooltipPropertyName.AutoDismiss.value,
                value = autoDismiss,
            ),
            Property.StringProperty(
                name = TooltipPropertyName.Text.value,
                value = text,
            ),
            Property.BooleanProperty(
                name = TooltipPropertyName.ContentStart.value,
                value = contentStart,
            ),
        )
    }

    private enum class TooltipPropertyName(val value: String) {
        Placement("placement"),
        PlacementMode("placementMode"),
        Alignment("alignment"),
        TriggerCentered("triggerCentered"),
        TriggerAlignment("triggerAlignment"),
        TailEnabled("tailEnabled"),
        AutoDismiss("autoDismiss"),
        Text("text"),
        ContentStart("hasContentStart"),
    }
}

/**
 * Фабрика для [TooltipViewModel]
 */
internal class TooltipViewModelFactory(
    private val defaultState: TooltipUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TooltipViewModel(defaultState, componentKey) as T
    }
}
