package com.sdds.playground.sandbox.slider.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SliderStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Slider
 */
internal class SliderViewModel(
    defaultState: SliderUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<SliderUiState, SliderStyle>(
    defaultState,
    componentKey,
) {

    override fun SliderUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class SliderViewModelFactory(
    private val defaultState: SliderUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SliderViewModel(defaultState, componentKey) as T
    }
}
