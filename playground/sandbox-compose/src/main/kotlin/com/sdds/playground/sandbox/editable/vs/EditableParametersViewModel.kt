package com.sdds.playground.sandbox.editable.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.editable.EditableUiState
import com.sdds.testing.vs.editable.IconPlacement
import com.sdds.testing.vs.editable.TextAlign

/**
 * ViewModel для экранов с компонентом Editable
 */
internal class EditableParametersViewModel(
    defaultState: EditableUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<EditableUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)
        when (EditablePropertyName.entries.find { it.value == name }) {
            EditablePropertyName.Enabled -> updateEnabled((value as? Boolean) == true)
            EditablePropertyName.ReadOnly -> updateReadOnly((value as? Boolean) == true)
            EditablePropertyName.SingleLine -> updateSingleLine((value as? Boolean) == true)
            EditablePropertyName.IconPlacement -> updateIconPlacement(
                IconPlacement.valueOf(value.toString()),
            )
            EditablePropertyName.TextAlignment -> updateTextAlignment(
                TextAlign.valueOf(value.toString()),
            )
            else -> Unit
        }
    }

    private fun updateEnabled(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    private fun updateReadOnly(readonly: Boolean) {
        internalUiState.value = internalUiState.value.copy(readonly = readonly)
    }

    private fun updateSingleLine(singleLine: Boolean) {
        internalUiState.value = internalUiState.value.copy(singleLine = singleLine)
    }

    private fun updateIconPlacement(iconPlacement: IconPlacement) {
        internalUiState.value = internalUiState.value.copy(iconPlacement = iconPlacement)
    }

    private fun updateTextAlignment(textAlignment: TextAlign) {
        internalUiState.value = internalUiState.value.copy(textAlignment = textAlignment)
    }

    override fun EditableUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = EditablePropertyName.Enabled.value,
                value = enabled,
            ),

            Property.BooleanProperty(
                name = EditablePropertyName.SingleLine.value,
                value = singleLine,
            ),
            Property.BooleanProperty(
                name = EditablePropertyName.ReadOnly.value,
                value = readonly,
            ),
            enumProperty(
                name = EditablePropertyName.IconPlacement.value,
                value = iconPlacement,
            ),
            enumProperty(
                name = EditablePropertyName.TextAlignment.value,
                value = textAlignment,
            ),
        )
    }

    private enum class EditablePropertyName(val value: String) {
        Enabled("enabled"),
        SingleLine("singleLine"),
        ReadOnly("readOnly"),
        IconPlacement("iconPlacement"),
        TextAlignment("textAlignment"),
    }
}

/**
 * Фабрика [EditableParametersViewModel]
 */
internal class EditableParametersViewModelFactory(
    private val defaultState: EditableUiState = EditableUiState(),
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return EditableParametersViewModel(defaultState, componentKey) as T
    }
}
