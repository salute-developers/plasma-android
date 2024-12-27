package com.sdds.playground.sandbox.counter.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.vs.PropertiesOwner
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экрана с компонентом Counter
 * @param defaultState состояние по-умолчанию
 */
internal class CounterParametersViewModel(
    private val defaultState: CounterUiState,
) : ViewModel(), PropertiesOwner {

    private val _counterUiState = MutableStateFlow(defaultState)

    val counterUiState: StateFlow<CounterUiState>
        get() = _counterUiState.asStateFlow()

    private val _propsMap = CounterPropertyName.values().associateBy { name -> name.value }

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        counterUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = _counterUiState.value
        _counterUiState.value = when (propertyName) {
            CounterPropertyName.Variant -> currentState.copy(
                variant = CounterVariant.valueOf(
                    valueString,
                ),
            )

            CounterPropertyName.Count -> if (valueString.matches(Regex("[0-9]+"))) {
                currentState.copy(count = valueString)
            } else {
                currentState
            }
            CounterPropertyName.Enabled -> currentState.copy(enabled = valueString.toBoolean())
        }
    }

    private fun CounterUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = CounterPropertyName.Variant.value,
                value = variant,
            ),
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

    override fun resetToDefault() {
        _counterUiState.value = defaultState
    }

    private enum class CounterPropertyName(val value: String) {
        Variant("variant"),
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
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CounterParametersViewModel(defaultState = defaultState) as T
    }
}
