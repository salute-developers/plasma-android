package com.sdds.playground.sandbox.switcher.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * ViewModel для экранов с компонентом Switch
 */
internal class SwitchParametersViewModel : ViewModel(), PropertiesOwner {

    private val _switchState = MutableStateFlow(SwitchUiState())

    /**
     * Состояние switch
     */
    val switchState: StateFlow<SwitchUiState>
        get() = _switchState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _switchState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _switchState.value = SwitchUiState()
    }

    fun updateActive(active: Boolean) {
        _switchState.value = _switchState.value.copy(active = active)
    }

    private fun updateLabel(text: String) {
        _switchState.value = _switchState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        _switchState.value = _switchState.value.copy(description = text.ifEmpty { null })
    }

    private fun updateEnabledState(enabled: Boolean) {
        _switchState.value = _switchState.value.copy(enabled = enabled)
    }

    private fun SwitchUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "active",
                value = active,
                onApply = { updateActive(it) },
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
