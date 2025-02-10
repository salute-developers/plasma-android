package com.sdds.playground.sandbox.indicator.vs

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
 * ViewModel компонента ProgressBar
 */
internal class IndicatorParametersViewModel(
    private val defaultState: IndicatorUiState,
) : ViewModel(), PropertiesOwner {

    private val _indicatorUiState = MutableStateFlow(defaultState)
    private val _propsMap = PropertyName.values().associateBy { name -> name.value }

    /**
     * Состояние компонента
     */
    val indicatorUiState: StateFlow<IndicatorUiState>
        get() = _indicatorUiState.asStateFlow()

    /**
     * @see PropertiesOwner.properties
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _indicatorUiState
            .mapLatest { it.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    /**
     * @see PropertiesOwner.resetToDefault
     */
    override fun resetToDefault() {
        _indicatorUiState.value = defaultState
    }

    override fun updateProperty(name: String, value: Any?) {
        val valueString = value?.toString() ?: return
        val propertyName = _propsMap[name] ?: return
        val currentState = _indicatorUiState.value
        _indicatorUiState.value = when (propertyName) {
            PropertyName.Variant -> currentState.copy(variant = IndicatorVariant.valueOf(valueString))
        }
    }

    private fun IndicatorUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = PropertyName.Variant.value,
                value = variant,
            ),
        )
    }

    private enum class PropertyName(val value: String) {
        Variant("variant"),
    }
}

internal class IndicatorParametersViewModelFactory(
    private val defaultState: IndicatorUiState = IndicatorUiState(),
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IndicatorParametersViewModel(defaultState) as T
    }
}
