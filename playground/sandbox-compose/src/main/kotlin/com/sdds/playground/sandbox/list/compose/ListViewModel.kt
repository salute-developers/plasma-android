package com.sdds.playground.sandbox.list.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ListStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class ListViewModel(
    defaultState: ListUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ListUiState, ListStyle>(defaultState, componentKey) {

    override fun ListUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "title",
                value = title,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(title = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasDisclosure",
                value = hasDisclosure,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasDisclosure = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasDivider",
                value = hasDivider,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasDivider = it)
                },
            ),
            Property.IntProperty(
                name = "amount",
                value = amount,
                onApply = {
                    if (it in 0..10) internalUiState.value = internalUiState.value.copy(amount = it)
                },
            ),
        )
    }
}

internal class ListViewModelFactory(
    private val defaultState: ListUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ListViewModel(defaultState, componentKey) as T
    }
}
