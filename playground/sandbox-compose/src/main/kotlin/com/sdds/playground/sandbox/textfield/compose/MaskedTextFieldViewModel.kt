package com.sdds.playground.sandbox.textfield.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

internal open class MaskedTextFieldViewModel(
    defaultState: MaskedTextFieldUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<MaskedTextFieldUiState, TextFieldStyle>(defaultState, componentKey) {

    fun onValueChange(textFieldValue: String) {
        internalUiState.value = internalUiState.value.copy(
            textFieldValue = textFieldValue,
        )
    }

    private fun updateMask(mask: TextMask) {
        internalUiState.value = internalUiState.value.copy(
            mask = mask,
            textFieldValue = "",
        )
    }

    private fun updateMaskMode(maskDisplayMode: MaskDisplayMode) {
        internalUiState.value = internalUiState.value.copy(
            maskDisplayMode = maskDisplayMode,
        )
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(
            labelText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholderText = text,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateReadOnlyState(readonly: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            readOnly = readonly,
        )
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasStartIcon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasEndIcon = hasIcon,
        )
    }

    private fun updatePrefix(prefix: String) {
        internalUiState.value = internalUiState.value.copy(prefix = prefix)
    }

    private fun updateSuffix(suffix: String) {
        internalUiState.value = internalUiState.value.copy(suffix = suffix)
    }

    @Suppress("LongMethod")
    override fun MaskedTextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "mask",
                value = mask,
                onApply = { updateMask(it) },
            ),
            enumProperty(
                name = "maskDisplayMode",
                value = maskDisplayMode,
                onApply = { updateMaskMode(it) },
            ),
            Property.StringProperty(
                name = "label",
                value = labelText,
                onApply = { updateLabel(it) },
            ),
            Property.StringProperty(
                name = "placeholder",
                value = placeholderText,
                onApply = { updatePlaceholder(it) },
            ),
            Property.BooleanProperty(
                name = "start icon",
                value = hasStartIcon,
                onApply = { updateStartIcon(it) },
            ),
            Property.BooleanProperty(
                name = "end icon",
                value = hasEndIcon,
                onApply = { updateEndIcon(it) },
            ),
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),
            Property.BooleanProperty(
                name = "read only",
                value = readOnly,
                onApply = { updateReadOnlyState(it) },
            ),
            Property.StringProperty(
                name = "prefix",
                value = prefix,
                onApply = { updatePrefix(it) },
            ),
            Property.StringProperty(
                name = "suffix",
                value = suffix,
                onApply = { updateSuffix(it) },
            ),
        )
    }
}

internal class MaskedTextFieldViewModelFactory(
    private val defaultState: MaskedTextFieldUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MaskedTextFieldViewModel(defaultState, componentKey) as T
    }
}
