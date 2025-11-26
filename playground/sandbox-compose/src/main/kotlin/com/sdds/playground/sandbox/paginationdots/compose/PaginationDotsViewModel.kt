package com.sdds.playground.sandbox.paginationdots.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента PaginationDots
 */
internal class PaginationDotsViewModel(
    defaultState: PaginationDotsUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<PaginationDotsUiState, PaginationDotsStyle>(defaultState, componentKey) {

    override fun PaginationDotsUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = "itemCount",
                value = itemCount,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(itemCount = it.coerceIn(visibleItemCount..100))
                },
            ),
            Property.IntProperty(
                name = "visibleItemCount",
                value = visibleItemCount,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(visibleItemCount = it.coerceIn(1..itemCount))
                },
            ),
            Property.IntProperty(
                name = "step",
                value = step,
                onApply = {
                    internalUiState.value =
                        internalUiState.value.copy(step = it.coerceIn(1..itemCount))
                },
            ),
        )
    }
}

internal class PaginationDotsViewModelFactory(
    private val defaultState: PaginationDotsUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PaginationDotsViewModel(defaultState, componentKey) as T
    }
}
