package com.sdds.playground.sandbox.autocomplete

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.AutocompleteStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Autocomplete
 */
internal class AutocompleteViewModel(
    defaultState: AutocompleteUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<AutocompleteUiState, AutocompleteStyle>(defaultState, componentKey) {

    override fun AutocompleteUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "withEmptyState",
                value = withEmptyState,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(withEmptyState = it)
                },
            ),
            Property.BooleanProperty(
                name = "showLoading",
                value = showLoading,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(showLoading = it)
                },
            ),
            enumProperty(
                name = "fieldAlignment",
                value = fieldAlignment,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(fieldAlignment = it)
                },
            ),
        )
    }
}

internal class AutocompleteViewModelFactory(
    private val defaultState: AutocompleteUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AutocompleteViewModel(defaultState, componentKey) as T
    }
}
