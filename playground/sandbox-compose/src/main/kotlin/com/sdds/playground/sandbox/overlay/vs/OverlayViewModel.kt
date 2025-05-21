package com.sdds.playground.sandbox.overlay.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.overlay.OverlayUiState

internal class OverlayViewModel(
    defaultState: OverlayUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<OverlayUiState>(defaultState, componentKey) {

    override fun OverlayUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

/**
 * Фабрика для [OverlayViewModel]
 */
internal class OverlayViewModelFactory(
    private val defaultState: OverlayUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return OverlayViewModel(defaultState, componentKey) as T
    }
}
