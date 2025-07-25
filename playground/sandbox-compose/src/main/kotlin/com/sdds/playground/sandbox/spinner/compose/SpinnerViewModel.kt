package com.sdds.playground.sandbox.spinner.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Spinner
 */
internal class SpinnerViewModel(
    defaultState: SpinnerUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SpinnerUiState, SpinnerStyle>(defaultState, componentKey) {

    override fun SpinnerUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class SpinnerViewModelFactory(
    private val defaultState: SpinnerUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SpinnerViewModel(defaultState, componentKey) as T
    }
}
