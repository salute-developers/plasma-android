package com.sdds.plasma.b2c.sandbox.checkbox

import androidx.compose.ui.state.ToggleableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.b2c.sandbox.core.PropertiesOwner
import com.sdds.plasma.b2c.sandbox.core.Property
import com.sdds.plasma.b2c.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом CheckBox
 */
internal class CheckBoxParametersViewModel : ViewModel(), PropertiesOwner {

    private val _checkboxState = MutableStateFlow(CheckBoxUiState())

    /**
     * Состояние checkbox
     */
    val checkboxState: StateFlow<CheckBoxUiState>
        get() = _checkboxState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _checkboxState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _checkboxState.value = CheckBoxUiState()
    }

    private fun updateState(state: ToggleableState) {
        _checkboxState.value = _checkboxState.value.copy(state = state)
    }

    private fun updateSize(size: Size) {
        _checkboxState.value = _checkboxState.value.copy(size = size)
    }

    private fun updateLabel(text: String) {
        _checkboxState.value = _checkboxState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        _checkboxState.value = _checkboxState.value.copy(description = text.ifEmpty { null })
    }

    private fun updateEnabledState(enabled: Boolean) {
        _checkboxState.value = _checkboxState.value.copy(enabled = enabled)
    }

    private fun CheckBoxUiState.toProps(): List<Property<*>> {
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

            Property.StringProperty(
                name = "label",
                value = label.orEmpty(),
                onApply = { updateLabel(it) },
            ),

            Property.StringProperty(
                name = "description",
                value = description.orEmpty(),
                onApply = { updateDescription(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),
        )
    }
}
