package com.sdds.playground.sandbox.indicator.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel компонента Indicator
 */
internal class IndicatorViewModel : ViewModel(), PropertiesOwner {
    private val _indicatorUiState = MutableStateFlow(IndicatorUiState())

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
        _indicatorUiState.value = IndicatorUiState()
    }

    private fun IndicatorUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "state",
                value = state,
                onApply = { updateState(it) },
            ),

            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),
        )
    }

    private fun updateState(state: State) {
        _indicatorUiState.value = _indicatorUiState.value.copy(state = state)
    }

    private fun updateSize(size: Size) {
        _indicatorUiState.value = _indicatorUiState.value.copy(size = size)
    }
}
