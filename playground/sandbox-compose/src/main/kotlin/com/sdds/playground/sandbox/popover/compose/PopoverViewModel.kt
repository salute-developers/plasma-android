package com.sdds.playground.sandbox.popover.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Popover
 */
internal class PopoverViewModel(
    defaultState: PopoverUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<PopoverUiState, PopoverStyle>(defaultState, componentKey) {

    override fun PopoverUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = "triggerAlignment",
                value = triggerPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(triggerPlacement = it)
                },
            ),
            enumProperty(
                name = "alignment",
                value = alignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(alignment = it)
                },
            ),
            enumProperty(
                name = "placement",
                value = placement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(placement = it)
                },
            ),
            enumProperty(
                name = "placementMode",
                value = placementMode,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(placementMode = it)
                },
            ),
            Property.BooleanProperty(
                name = "autoHide",
                value = autoHide,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(autoHide = it)
                },
            ),
            Property.BooleanProperty(
                name = "triggerCentered",
                value = triggerCentered,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        triggerCentered = it,
                    )
                },
            ),
            Property.BooleanProperty(
                name = "tailEnabled",
                value = tailEnabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        tailEnabled = it,
                    )
                },
            ),
        )
    }
}

internal class PopoverViewModelFactory(
    private val defaultState: PopoverUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PopoverViewModel(defaultState, componentKey) as T
    }
}
