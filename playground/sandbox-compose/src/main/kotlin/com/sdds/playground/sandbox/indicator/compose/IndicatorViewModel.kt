package com.sdds.playground.sandbox.indicator.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Indicator
 */
internal class IndicatorViewModel(
    defaultState: IndicatorUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<IndicatorUiState, IndicatorStyle>(defaultState, componentKey) {

    override fun IndicatorUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class IndicatorViewModelFactory(
    private val defaultState: IndicatorUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IndicatorViewModel(defaultState, componentKey) as T
    }
}
