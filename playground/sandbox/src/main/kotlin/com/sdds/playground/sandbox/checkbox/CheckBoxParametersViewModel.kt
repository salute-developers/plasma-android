package com.sdds.playground.sandbox.checkbox

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import com.sdds.uikit.CheckBox
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
internal class CheckBoxParametersViewModel(
    private val defaultState: CheckBoxUiState,
) : ViewModel(), PropertiesOwner {

    private val _checkboxState = MutableStateFlow(defaultState)

    /**
     * Состояние CheckBox
     */
    val checkboxState: StateFlow<CheckBoxUiState>
        get() = _checkboxState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _checkboxState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        when (CheckBoxPropertyName.values().find { it.value == name }) {
            CheckBoxPropertyName.Variant ->
                updateVariant(CheckBoxVariant.valueOf(value?.toString() ?: return))
            CheckBoxPropertyName.State ->
                updateState(CheckBox.ToggleableState.valueOf(value?.toString() ?: return))
            CheckBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            CheckBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            CheckBoxPropertyName.Enabled -> updateEnabledState((value as? Boolean) == true)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _checkboxState.value = defaultState
    }

    private fun updateState(state: CheckBox.ToggleableState) {
        _checkboxState.value = _checkboxState.value.copy(state = state)
    }

    private fun updateVariant(variant: CheckBoxVariant) {
        _checkboxState.value = _checkboxState.value.copy(variant = variant)
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
                name = CheckBoxPropertyName.Variant.value,
                value = variant,
            ),

            enumProperty(
                name = CheckBoxPropertyName.State.value,
                value = state,
            ),

            Property.StringProperty(
                name = CheckBoxPropertyName.Label.value,
                value = label.orEmpty(),
            ),

            Property.StringProperty(
                name = CheckBoxPropertyName.Description.value,
                value = description.orEmpty(),
            ),

            Property.BooleanProperty(
                name = CheckBoxPropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private enum class CheckBoxPropertyName(val value: String) {
        Variant("variant"),
        State("state"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

internal class CheckBoxParametersViewModelFactory(
    private val defaultState: CheckBoxUiState = CheckBoxUiState(),
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CheckBoxParametersViewModel(defaultState) as T
    }
}
