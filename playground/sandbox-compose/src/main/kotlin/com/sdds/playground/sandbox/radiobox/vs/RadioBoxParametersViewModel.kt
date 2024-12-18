package com.sdds.playground.sandbox.radiobox.vs

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
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxParametersViewModel(
    private val defaultState: RadioBoxUiState,
    private val groupMode: Boolean,
) : ViewModel(), PropertiesOwner {

    private val _radioBoxState = MutableStateFlow(defaultState)

    /**
     * Состояние RadioBox
     */
    val radioBoxState: StateFlow<RadioBoxUiState>
        get() = _radioBoxState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _radioBoxState
            .mapLatest { state -> if (groupMode) state.toGroupProps() else state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun updateProperty(name: String, value: Any?) {
        when (RadioBoxPropertyName.values().find { it.value == name }) {
            RadioBoxPropertyName.Variant ->
                updateVariant(RadioBoxVariant.valueOf(value?.toString() ?: return))
            RadioBoxPropertyName.Checked -> updateState((value as? Boolean) == true)
            RadioBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            RadioBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            RadioBoxPropertyName.Enabled -> updateEnabledState((value as? Boolean) == true)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _radioBoxState.value = defaultState
    }

    private fun updateState(checked: Boolean) {
        _radioBoxState.value = _radioBoxState.value.copy(checked = checked)
    }

    private fun updateVariant(variant: RadioBoxVariant) {
        _radioBoxState.value = _radioBoxState.value.copy(variant = variant)
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
            enumProperty(
                name = RadioBoxPropertyName.Variant.value,
                value = variant,
            ),

            Property.BooleanProperty(
                name = RadioBoxPropertyName.Checked.value,
                value = checked,
            ),

            Property.StringProperty(
                name = RadioBoxPropertyName.Label.value,
                value = label.orEmpty(),
            ),

            Property.StringProperty(
                name = RadioBoxPropertyName.Description.value,
                value = description.orEmpty(),
            ),

            Property.BooleanProperty(
                name = RadioBoxPropertyName.Enabled.value,
                value = enabled,
            ),
        )
    }

    private fun RadioBoxUiState.toGroupProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = RadioBoxPropertyName.Variant.value,
                value = variant,
            ),
            Property.StringProperty(
                name = RadioBoxPropertyName.Label.value,
                value = label.orEmpty(),
            ),

            Property.StringProperty(
                name = RadioBoxPropertyName.Description.value,
                value = description.orEmpty(),
            ),
        )
    }

    private enum class RadioBoxPropertyName(val value: String) {
        Variant("variant"),
        Checked("checked"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [RadioBoxParametersViewModel]
 * @param groupMode режим группы
 * @param defaultState состояние по-умолчанию
 */
internal class RadioBoxParametersViewModelFactory(
    private val groupMode: Boolean = false,
    private val defaultState: RadioBoxUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxParametersViewModel(groupMode = groupMode, defaultState = defaultState) as T
    }
}
