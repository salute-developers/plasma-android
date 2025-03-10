package com.sdds.playground.sandbox.indicator.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.indicator.IndicatorUiState

/**
 * ViewModel компонента ProgressBar
 */
internal class IndicatorParametersViewModel(
    defaultState: IndicatorUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<IndicatorUiState>(defaultState, componentKey) {

    override fun IndicatorUiState.toProps() = emptyList<Property<*>>()
}

internal class IndicatorParametersViewModelFactory(
    private val defaultState: IndicatorUiState = IndicatorUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IndicatorParametersViewModel(defaultState, componentKey) as T
    }
}
