package com.sdds.playground.sandbox.image

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ImageStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Image
 */
internal class ImageViewModel(
    defaultState: ImageUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ImageUiState, ImageStyle>(defaultState, componentKey) {

    override fun ImageUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

internal class ImageViewModelFactory(
    private val defaultState: ImageUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ImageViewModel(defaultState, componentKey) as T
    }
}
