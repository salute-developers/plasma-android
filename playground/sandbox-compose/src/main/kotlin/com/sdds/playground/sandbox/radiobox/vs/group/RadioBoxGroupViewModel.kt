package com.sdds.playground.sandbox.radiobox.vs.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.radiobox.RadioBoxUiState

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxGroupViewModel(
    defaultState: RadioBoxUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RadioBoxUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (RadioBoxPropertyName.values().find { it.value == name }) {
            RadioBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            RadioBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            else -> Unit
        }
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        internalUiState.value = internalUiState.value.copy(description = text.ifEmpty { null })
    }

    override fun RadioBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
        Label("label"),
        Description("description"),
    }
}

/**
 * Фабрика [RadioBoxGroupViewModel]
 * @param defaultState состояние по-умолчанию
 */
internal class RadioBoxGroupViewModelFactory(
    private val defaultState: RadioBoxUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxGroupViewModel(defaultState, componentKey) as T
    }
}
