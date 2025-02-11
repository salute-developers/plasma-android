package com.sdds.playground.sandbox.textfield.compose

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal open class TextFieldViewModel(
    defaultState: TextFieldUiState,
    private val theme: Theme.ThemeInfoCompose,
    private val textFieldType: TextFieldType,
) : ComponentViewModel<TextFieldUiState, TextFieldStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, TextFieldStyle> {
        return when (textFieldType) {
            TextFieldType.TextField -> theme.stylesProvider.textField
            TextFieldType.TextFieldClear -> theme.stylesProvider.textFieldClear
            TextFieldType.TextArea -> theme.stylesProvider.textArea
            TextFieldType.TextAreaClear -> theme.stylesProvider.textAreaClear
        }
    }

    fun onValueChange(textFieldValue: TextFieldValue) {
        internalUiState.value = internalUiState.value.copy(
            textFieldValue = textFieldValue,
        )
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(
            labelText = text,
        )
    }

    private fun updateOptionalText(text: String) {
        internalUiState.value = internalUiState.value.copy(
            optionalText = text,
        )
    }

    private fun updateCaption(text: String) {
        internalUiState.value = internalUiState.value.copy(
            captionText = text,
        )
    }

    private fun updateCounter(text: String) {
        internalUiState.value = internalUiState.value.copy(
            counterText = text,
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

    private fun updateChipsCount(count: Int) {
        if (count < 0) return
        internalUiState.value = internalUiState.value.copy(chips = List(count) { "chip $it" })
    }

    private fun updatePrefix(prefix: String) {
        internalUiState.value = internalUiState.value.copy(prefix = prefix)
    }

    private fun updateSuffix(suffix: String) {
        internalUiState.value = internalUiState.value.copy(suffix = suffix)
    }

    @Suppress("LongMethod")
    override fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "label",
                value = labelText,
                onApply = { updateLabel(it) },
            ),
            Property.StringProperty(
                name = "optional text",
                value = optionalText,
                onApply = { updateOptionalText(it) },
            ),
            Property.StringProperty(
                name = "caption",
                value = captionText,
                onApply = { updateCaption(it) },
            ),
            Property.StringProperty(
                name = "counter",
                value = counterText,
                onApply = { updateCounter(it) },
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
            Property.IntProperty(
                name = "chips count",
                value = chips.size,
                onApply = { updateChipsCount(it) },
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

    fun onBackspacePressed() {
        if (internalUiState.value.chips.isEmpty()) return
        internalUiState.value = internalUiState.value.copy(
            chips = internalUiState.value.chips.dropLast(1),
        )
    }

    fun onChipClosePressed(chipToRemove: String) {
        internalUiState.value = internalUiState.value.copy(
            chips = internalUiState.value.chips.filterNot { it == chipToRemove },
        )
    }
}

internal class TextFieldViewModelFactory(
    private val defaultState: TextFieldUiState,
    private val theme: Theme.ThemeInfoCompose,
    private val textFieldType: TextFieldType,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TextFieldViewModel(defaultState, theme, textFieldType) as T
    }
}
