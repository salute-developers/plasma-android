package com.sdds.playground.sandbox.dropdownmenu.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента DropdownMenu
 */
internal class DropdownMenuViewModel(
    defaultState: DropdownMenuUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DropdownMenuUiState, DropdownMenuStyle>(defaultState, componentKey) {

    override fun DropdownMenuUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = { if (it in 1..10) { updateAmount(it) } },
            ),
            Property.StringProperty(
                name = "itemTitle",
                value = itemTitle,
                onApply = { updateItemTitle(it) },
            ),
            Property.BooleanProperty(
                name = "hasDisclosure",
                value = hasDisclosure,
                onApply = { updateHasDisclosure(it) },
            ),
            Property.BooleanProperty(
                name = "itemDividerEnabled",
                value = itemDividerEnabled,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(
                        itemDividerEnabled = it,
                    )
                },
            ),
            enumProperty(
                name = "placementMode",
                value = placementMode,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(placementMode = it)
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
                name = "alignment",
                value = alignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(alignment = it)
                },
            ),
            enumProperty(
                name = "triggerAlignment",
                value = triggerPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(triggerPlacement = it)
                },
            ),
        )
    }

    private fun updateAmount(amount: Int) {
        internalUiState.value = internalUiState.value.copy(
            amount = amount,
        )
    }

    private fun updateItemTitle(itemTitle: String) {
        internalUiState.value = internalUiState.value.copy(
            itemTitle = itemTitle,
        )
    }

    private fun updateHasDisclosure(hasDisclosure: Boolean) {
        internalUiState.value = internalUiState.value.copy(hasDisclosure = hasDisclosure)
    }
}

internal class DropdownMenuViewModelFactory(
    private val defaultState: DropdownMenuUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DropdownMenuViewModel(defaultState, componentKey) as T
    }
}
