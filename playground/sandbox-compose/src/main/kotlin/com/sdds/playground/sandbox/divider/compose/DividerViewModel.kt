package com.sdds.playground.sandbox.divider.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.DividerStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Divider
 */
internal class DividerViewModel(
    defaultState: DividerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DividerUiState, DividerStyle>(defaultState, componentKey) {

    override fun DividerUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class DividerViewModelFactory(
    private val defaultState: DividerUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DividerViewModel(defaultState, componentKey) as T
    }
}
