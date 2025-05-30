package com.sdds.playground.sandbox.rectskeleton.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.skeleton.RectSkeletonUiState

/**
 * ViewModel компонента ProgressBar
 */
internal class RectSkeletonParametersViewModel(
    defaultState: RectSkeletonUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RectSkeletonUiState>(defaultState, componentKey) {

    override fun RectSkeletonUiState.toProps() = emptyList<Property<*>>()
}

internal class RectSkeletonParametersViewModelFactory(
    private val defaultState: RectSkeletonUiState = RectSkeletonUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RectSkeletonParametersViewModel(defaultState, componentKey) as T
    }
}
