package com.sdds.playground.sandbox.scrollbar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента ScrollBar
 */
internal class ScrollBarViewModel(
    defaultState: ScrollBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<ScrollBarUiState, ScrollBarStyle>(defaultState, componentKey) {

    override fun ScrollBarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "itemCount",
                value = itemCount,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(itemCount = it.coerceIn(1..100))
                },
            ),
            Property.BooleanProperty(
                name = "lazy",
                value = lazy,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(lazy = it)
                },
            ),
            Property.BooleanProperty(
                name = "hasTrack",
                value = hasTrack,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hasTrack = it)
                },
            ),
            Property.BooleanProperty(
                name = "hoverExpand",
                value = hoverExpand,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(hoverExpand = it)
                },
            ),
            Property.BooleanProperty(
                name = "alwaysShowScrollbar",
                value = alwaysShowScrollbar,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(alwaysShowScrollbar = it)
                },
            ),
        )
    }
}

internal class ScrollBarViewModelFactory(
    private val defaultState: ScrollBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ScrollBarViewModel(defaultState, componentKey) as T
    }
}
