package com.sdds.playground.sandbox.checkbox.vs.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.checkbox.CheckBoxUiState

/**
 * ViewModel для экранов с компонентом CheckBox
 */
internal class CheckBoxGroupViewModel(
    defaultState: CheckBoxUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CheckBoxUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (CheckBoxPropertyName.values().find { it.value == name }) {
            CheckBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            CheckBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            else -> Unit
        }
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        internalUiState.value = internalUiState.value.copy(description = text.ifEmpty { null })
    }

    override fun CheckBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = CheckBoxPropertyName.Label.value,
                value = label.orEmpty(),
            ),

            Property.StringProperty(
                name = CheckBoxPropertyName.Description.value,
                value = description.orEmpty(),
            ),
        )
    }

    private enum class CheckBoxPropertyName(val value: String) {
        Label("label"),
        Description("description"),
    }
}

/**
 * Фабрика [CheckBoxGroupViewModel]
 */
internal class CheckBoxGroupViewModelFactory(
    private val defaultState: CheckBoxUiState = CheckBoxUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CheckBoxGroupViewModel(defaultState, componentKey) as T
    }
}
