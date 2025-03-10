package com.sdds.playground.sandbox.counter.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.counter.CounterUiState

/**
 * ViewModel для экрана с компонентом Counter
 * @param defaultState состояние по-умолчанию
 */
internal class CounterParametersViewModel(
    defaultState: CounterUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CounterUiState>(defaultState, componentKey) {

    private val _propsMap = CounterPropertyName.values().associateBy { name -> name.value }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            CounterPropertyName.Count -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(count = valueString)
            } else {
                currentState
            }

            CounterPropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
        }
    }

    override fun CounterUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = CounterPropertyName.Count.value,
                value = count,
            ),
            Property.BooleanProperty(
                name = CounterPropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private enum class CounterPropertyName(val value: String) {
        Count("count"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [CounterParametersViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class CounterParametersViewModelFactory(
    private val defaultState: CounterUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CounterParametersViewModel(defaultState = defaultState, componentKey = componentKey) as T
    }
}
