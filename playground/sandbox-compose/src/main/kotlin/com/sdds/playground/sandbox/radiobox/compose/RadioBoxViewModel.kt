package com.sdds.playground.sandbox.radiobox.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxViewModel(
    defaultState: RadioBoxUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<RadioBoxUiState, RadioBoxStyle>(defaultState, componentKey) {

    private fun updateChecked(checked: Boolean) {
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
                name = "checked",
                value = checked,
                onApply = { updateChecked(it) },
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

internal class RadioBoxViewModelFactory(
    private val defaultState: RadioBoxUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxViewModel(defaultState, componentKey) as T
    }
}
