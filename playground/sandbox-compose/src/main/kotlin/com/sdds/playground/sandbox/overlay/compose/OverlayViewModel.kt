package com.sdds.playground.sandbox.overlay.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.OverlayStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Overlay
 */
internal class OverlayViewModel(
    defaultState: OverlayUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<OverlayUiState, OverlayStyle>(defaultState, componentKey) {

    override fun OverlayUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class OverlayViewModelFactory(
    private val defaultState: OverlayUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return OverlayViewModel(defaultState, componentKey) as T
    }
}
