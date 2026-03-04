package com.sdds.playground.sandbox.toolbar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class ToolBarViewModel(
    defaultState: ToolBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ToolBarUiState, ToolBarStyle>(defaultState, componentKey) {

    override fun ToolBarUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "sections",
                value = sections,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(sections = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasDivider",
                value = hasDivider,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasDivider = it)
                },
            ),
        )
    }
}

internal class ToolBarViewModelFactory(
    private val defaultState: ToolBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ToolBarViewModel(defaultState, componentKey) as T
    }
}
