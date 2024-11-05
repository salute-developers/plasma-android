package com.sdds.plasma.b2c.sandbox.radiobox

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.PropertiesOwner
import com.sdds.playground.sandbox.core.Property
import com.sdds.playground.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxParametersViewModel : ViewModel(), PropertiesOwner {

    private val _radioBoxState = MutableStateFlow(RadioBoxUiState())

    /**
     * Состояние кнопки
     */
    val radioBoxState: StateFlow<RadioBoxUiState>
        get() = _radioBoxState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _radioBoxState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _radioBoxState.value = RadioBoxUiState()
    }

    private fun updateChecked(checked: Boolean) {
        _radioBoxState.value = _radioBoxState.value.copy(checked = checked)
    }

    private fun updateSize(size: Size) {
        _radioBoxState.value = _radioBoxState.value.copy(size = size)
    }

    private fun updateLabel(text: String) {
        _radioBoxState.value = _radioBoxState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        _radioBoxState.value = _radioBoxState.value.copy(description = text.ifEmpty { null })
    }

    private fun updateEnabledState(enabled: Boolean) {
        _radioBoxState.value = _radioBoxState.value.copy(enabled = enabled)
    }

    private fun RadioBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "checked",
                value = checked,
                onApply = { updateChecked(it) },
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
