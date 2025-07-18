package com.sdds.playground.sandbox.spinner.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.spinner.SpinnerUiState

/**
 * ViewModel компонента Spinner
 */
internal class SpinnerParametersViewModel(
    defaultState: SpinnerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SpinnerUiState>(defaultState, componentKey) {

    override fun SpinnerUiState.toProps() = emptyList<Property<*>>()
}

internal class SpinnerParametersViewModelFactory(
    private val defaultState: SpinnerUiState = SpinnerUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SpinnerParametersViewModel(defaultState, componentKey) as T
    }
}
