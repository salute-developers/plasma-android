package com.sdds.playground.sandbox.divider.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.divider.DividerUiState

/**
 * ViewModel компонента Divider
 */
internal class DividerViewModel(
    defaultState: DividerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<DividerUiState>(defaultState, componentKey) {

    override fun DividerUiState.toProps() = emptyList<Property<*>>()
}

internal class DividerViewModelFactory(
    private val defaultState: DividerUiState = DividerUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DividerViewModel(defaultState, componentKey) as T
    }
}
