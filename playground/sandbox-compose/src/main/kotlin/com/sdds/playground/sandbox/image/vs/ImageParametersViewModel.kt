package com.sdds.playground.sandbox.image.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.image.ImageUiState

/**
 * ViewModel компонента ImageView
 */
internal class ImageParametersViewModel(
    defaultState: ImageUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ImageUiState>(defaultState, componentKey) {

    override fun ImageUiState.toProps() = emptyList<Property<*>>()
}

internal class ImageParametersViewModelFactory(
    private val defaultState: ImageUiState = ImageUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ImageParametersViewModel(defaultState, componentKey) as T
    }
}
