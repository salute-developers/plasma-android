package com.sdds.playground.sandbox.radiobox.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.radiobox.RadioBoxUiState

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxViewModel(
    defaultState: RadioBoxUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RadioBoxUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (RadioBoxPropertyName.values().find { it.value == name }) {
            RadioBoxPropertyName.Checked -> updateState((value as? Boolean) == true)
            RadioBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            RadioBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            RadioBoxPropertyName.Enabled -> updateEnabledState((value as? Boolean) == true)
            else -> Unit
        }
    }

    private fun updateState(checked: Boolean) {
        internalUiState.value = internalUiState.value.copy(checked = checked)
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        internalUiState.value = internalUiState.value.copy(description = text.ifEmpty { null })
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    override fun RadioBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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

    private enum class RadioBoxPropertyName(val value: String) {
        Checked("checked"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [RadioBoxViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class RadioBoxViewModelFactory(
    private val defaultState: RadioBoxUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxViewModel(defaultState, componentKey) as T
    }
}
