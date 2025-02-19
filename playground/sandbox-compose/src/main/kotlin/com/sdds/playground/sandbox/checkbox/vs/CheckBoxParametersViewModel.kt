package com.sdds.playground.sandbox.checkbox.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.checkbox.CheckBoxUiState
import com.sdds.uikit.CheckBox

/**
 * ViewModel для экранов с компонентом CheckBox
 */
internal class CheckBoxParametersViewModel(
    defaultState: CheckBoxUiState,
) : ComponentViewModel<CheckBoxUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.checkBox
    }

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        when (CheckBoxPropertyName.values().find { it.value == name }) {
            CheckBoxPropertyName.State ->
                updateState(CheckBox.ToggleableState.valueOf(value?.toString() ?: return))

            CheckBoxPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            CheckBoxPropertyName.Description -> updateDescription(value?.toString().orEmpty())
            CheckBoxPropertyName.Enabled -> updateEnabledState((value as? Boolean) == true)
            else -> Unit
        }
    }

    private fun updateState(state: CheckBox.ToggleableState) {
        internalUiState.value = internalUiState.value.copy(state = state)
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

    override fun CheckBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
        State("state"),
        Label("label"),
        Description("description"),
        Enabled("enabled"),
    }
}

/**
 * Фабрика [CheckBoxParametersViewModel]
 */
internal class CheckBoxParametersViewModelFactory(
    private val defaultState: CheckBoxUiState = CheckBoxUiState(),
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CheckBoxParametersViewModel(defaultState) as T
    }
}
