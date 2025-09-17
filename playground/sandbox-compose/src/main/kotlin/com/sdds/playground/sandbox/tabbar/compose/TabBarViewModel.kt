package com.sdds.playground.sandbox.tabbar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal class TabBarViewModel(
    defaultState: TabBarUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<TabBarUiState, TabBarStyle>(defaultState, componentKey) {

    fun onSelect(id: Int) {
        internalUiState.value = internalUiState.value.copy(
            current = id,
        )
    }

    fun isSelected(id: Int): Boolean {
        return internalUiState.value.current == id
    }

    override fun TabBarUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.IntProperty(
                name = "amount",
                value = items.size,
                onApply = { amount ->
                    if (amount in 2..6) {
                        internalUiState.value =
                            internalUiState.value.copy(items = MutableList(amount) { it })
                    }
                },
            ),
            enumProperty(
                name = "extraType",
                value = extraType,
                onApply = { internalUiState.value = internalUiState.value.copy(extraType = it) },
            ),
            Property.BooleanProperty(
                name = "showAssistant",
                value = showAssistant,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(showAssistant = it)
                },
            ),
        )
    }
}

internal class TabBarViewModelFactory(
    private val defaultState: TabBarUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TabBarViewModel(defaultState, componentKey) as T
    }
}
