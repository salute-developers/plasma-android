package com.sdds.playground.sandbox.rectskeleton.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента RectSkeleton
 */
internal class RectSkeletonViewModel(
    defaultState: RectSkeletonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RectSkeletonUiState, RectSkeletonStyle>(defaultState, componentKey) {

    override fun RectSkeletonUiState.toProps() = emptyList<Property<*>>()
}

internal class RectSkeletonViewModelFactory(
    private val defaultState: RectSkeletonUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RectSkeletonViewModel(defaultState, componentKey) as T
    }
}
