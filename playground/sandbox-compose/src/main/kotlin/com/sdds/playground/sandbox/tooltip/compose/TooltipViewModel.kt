package com.sdds.playground.sandbox.tooltip.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Tooltip
 */
internal class TooltipViewModel(
    defaultState: TooltipUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TooltipUiState, TooltipStyle>(defaultState, componentKey) {

    override fun TooltipUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "text",
                value = text,
                onApply = { internalUiState.value = internalUiState.value.copy(text = it) },
            ),
            enumProperty(
                name = "triggerAlignment",
                value = triggerPlacement,
                onApply = { internalUiState.value = internalUiState.value.copy(triggerPlacement = it) },
            ),
            enumProperty(
                name = "alignment",
                value = alignment,
                onApply = { internalUiState.value = internalUiState.value.copy(alignment = it) },
            ),
            enumProperty(
                name = "placement",
                value = placement,
                onApply = { internalUiState.value = internalUiState.value.copy(placement = it) },
            ),
            enumProperty(
                name = "placementMode",
                value = placementMode,
                onApply = { internalUiState.value = internalUiState.value.copy(placementMode = it) },
            ),
            Property.BooleanProperty(
                name = "autoHide",
                value = autoHide,
                onApply = { internalUiState.value = internalUiState.value.copy(autoHide = it) },
            ),
            Property.BooleanProperty(
                name = "triggerCentered",
                value = triggerCentered,
                onApply = { internalUiState.value = internalUiState.value.copy(triggerCentered = it) },
            ),
            Property.BooleanProperty(
                name = "tailEnabled",
                value = tailEnabled,
                onApply = { internalUiState.value = internalUiState.value.copy(tailEnabled = it) },
            ),
            Property.BooleanProperty(
                name = "hasContentStart",
                value = hasContentStart,
                onApply = { internalUiState.value = internalUiState.value.copy(hasContentStart = it) },
            ),
        )
    }
}

internal class TooltipViewModelFactory(
    private val defaultState: TooltipUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TooltipViewModel(defaultState, componentKey) as T
    }
}
