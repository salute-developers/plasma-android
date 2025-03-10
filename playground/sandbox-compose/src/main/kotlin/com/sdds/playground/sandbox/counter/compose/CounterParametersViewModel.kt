package com.sdds.playground.sandbox.counter.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CounterStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Counter
 */
internal class CounterParametersViewModel(
    defaultState: CounterUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CounterUiState, CounterStyle>(defaultState, componentKey) {

    private fun updateCount(text: String) {
        internalUiState.value = internalUiState.value.copy(count = text)
    }

    override fun CounterUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "count",
                value = count,
                onApply = { updateCount(it) },
            ),
        )
    }
}

/**
 * Фабрика [CounterParametersViewModel]
 */
internal class CounterParametersViewModelFactory(
    private val defaultState: CounterUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CounterParametersViewModel(defaultState, componentKey) as T
    }
}
