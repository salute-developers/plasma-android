package com.sdds.playground.sandbox.paginationdots.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.paginationdots.PaginationDotsUiState

internal class PaginationDotsViewModel(
    defaultState: PaginationDotsUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<PaginationDotsUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        val valueString = value?.toString() ?: return
        val currentState = internalUiState.value
        val propertyName = PaginationDotsPropertyName.values().find { it.value == name }
        internalUiState.value = when (propertyName) {
            PaginationDotsPropertyName.ITEM_COUNT -> currentState.copy(itemCount = valueString.toIntOrNull() ?: 0)
            PaginationDotsPropertyName.VISIBLE_ITEM_COUNT -> currentState.copy(
                visibleItemCount = valueString.toIntOrNull() ?: 0,
            )
            PaginationDotsPropertyName.STEP -> currentState.copy(step = valueString.toIntOrNull() ?: 1)
            else -> currentState
        }
    }

    override fun PaginationDotsUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.IntProperty(
                name = PaginationDotsPropertyName.ITEM_COUNT.value,
                value = itemCount,
            ),
            Property.IntProperty(
                name = PaginationDotsPropertyName.VISIBLE_ITEM_COUNT.value,
                value = visibleItemCount,
            ),
            Property.IntProperty(
                name = PaginationDotsPropertyName.STEP.value,
                value = step,
            ),
        )
    }

    private enum class PaginationDotsPropertyName(val value: String) {
        ITEM_COUNT("itemCount"),
        VISIBLE_ITEM_COUNT("visibleItemCount"),
        STEP("step"),
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
