package com.sdds.playground.sandbox.editable

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.EditableStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Editable
 */
internal class EditableViewModel(
    defaultState: EditableUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<EditableUiState, EditableStyle>(defaultState, componentKey) {

    override fun EditableUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { internalUiState.value = internalUiState.value.copy(enabled = it) },
            ),
            Property.BooleanProperty(
                name = "readonly",
                value = readonly,
                onApply = { internalUiState.value = internalUiState.value.copy(readonly = it) },
            ),
            Property.BooleanProperty(
                name = "singleLine",
                value = singleLine,
                onApply = { internalUiState.value = internalUiState.value.copy(singleLine = it) },
            ),
            enumProperty(
                name = "iconPlacement",
                value = iconPlacement,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(iconPlacement = it)
                },
            ),
            enumProperty(
                name = "textAlign",
                value = textAlign,
                onApply = {
                    internalUiState.value = internalUiState.value.copy(textAlign = it)
                },
            ),
        )
    }
}

internal class EditableViewModelFactory(
    private val defaultState: EditableUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return EditableViewModel(defaultState, componentKey) as T
    }
}
