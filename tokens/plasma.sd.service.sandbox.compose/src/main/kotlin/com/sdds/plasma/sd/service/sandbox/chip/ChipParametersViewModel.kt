package com.sdds.plasma.sd.service.sandbox.chip

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.sd.service.sandbox.core.PropertiesOwner
import com.sdds.plasma.sd.service.sandbox.core.Property
import com.sdds.plasma.sd.service.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Chip
 */
internal class ChipParametersViewModel : ViewModel(), PropertiesOwner {

    private val _chipState = MutableStateFlow(ChipUiState())

    /**
     * Состояние chip
     */
    val chipState: StateFlow<ChipUiState>
        get() = _chipState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _chipState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _chipState.value = ChipUiState()
    }

    private fun updateSize(size: Size) {
        _chipState.value = _chipState.value.copy(size = size)
    }

    private fun updateLabel(text: String) {
        _chipState.value = _chipState.value.copy(label = text)
    }

    private fun updateEnabledState(enabled: Boolean) {
        _chipState.value = _chipState.value.copy(enabled = enabled)
    }

    private fun updateState(state: State) {
        _chipState.value = _chipState.value.copy(state = state)
    }

    private fun updateShape(shape: Shape) {
        _chipState.value = _chipState.value.copy(shape = shape)
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        _chipState.value = _chipState.value.copy(hasStartIcon = hasIcon)
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _chipState.value = _chipState.value.copy(hasEndIcon = hasIcon)
    }

    private fun updateClickable(isClickable: Boolean) {
        _chipState.value = _chipState.value.copy(isClickable = isClickable)
    }

    private fun ChipUiState.toProps(): List<Property<*>> {
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

            enumProperty(
                name = "shape",
                value = shape,
                onApply = { updateShape(it) },
            ),

            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { updateLabel(it) },
            ),

            Property.BooleanProperty(
                name = "start icon",
                value = hasStartIcon,
                onApply = { updateStartIcon(it) },
            ),

            Property.BooleanProperty(
                name = "end icon",
                value = hasEndIcon,
                onApply = { updateEndIcon(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),

            Property.BooleanProperty(
                name = "clickable",
                value = isClickable,
                onApply = { updateClickable(it) },
            ),
        )
    }
}
