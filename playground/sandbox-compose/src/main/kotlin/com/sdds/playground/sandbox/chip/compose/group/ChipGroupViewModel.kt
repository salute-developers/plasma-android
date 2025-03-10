package com.sdds.playground.sandbox.chip.compose.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class ChipGroupViewModel(
    defaultState: ChipGroupUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ChipGroupUiState, ChipGroupStyle>(defaultState, componentKey) {

    private fun updateQuantity(quantity: Int, label: String) {
        if (quantity !in 2..10) return
        internalUiState.value = internalUiState.value.copy(
            items = List(quantity) { label },
        )
    }

    private fun updateLabel(label: String) {
        internalUiState.value = internalUiState.value.copy(
            items = internalUiState.value.items.map { label },
        )
    }

    private fun updateWrap(wrap: Boolean) {
        internalUiState.value = internalUiState.value.copy(shouldWrap = wrap)
    }

    private fun updateEnabled(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    override fun ChipGroupUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "quantity",
                value = items.size,
                onApply = { updateQuantity(it, items.first()) },
            ),

            Property.StringProperty(
                name = "label",
                value = items.first(),
                onApply = { updateLabel(it) },
            ),

            Property.BooleanProperty(
                name = "wrap",
                value = shouldWrap,
                onApply = { updateWrap(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabled(it) },
            ),
        )
    }
}

internal class ChipGroupViewModelFactory(
    private val defaultState: ChipGroupUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ChipGroupViewModel(defaultState, componentKey) as T
    }
}
