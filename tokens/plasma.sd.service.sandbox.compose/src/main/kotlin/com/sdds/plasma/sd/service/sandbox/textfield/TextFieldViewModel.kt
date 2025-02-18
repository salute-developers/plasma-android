package com.sdds.plasma.sd.service.sandbox.textfield

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.plasma.sd.service.sandbox.core.PropertiesOwner
import com.sdds.plasma.sd.service.sandbox.core.Property
import com.sdds.plasma.sd.service.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal class TextFieldViewModel : ViewModel(), PropertiesOwner {

    private val _textFieldUiState = MutableStateFlow(TextFieldUiState())

    val textFieldUiState: StateFlow<TextFieldUiState>
        get() = _textFieldUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _textFieldUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    override fun resetToDefault() {
        _textFieldUiState.value = TextFieldUiState()
    }

    fun onValueChange(textFieldValue: TextFieldValue) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            textFieldValue = textFieldValue,
        )
    }

    private fun updateLabel(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            labelText = text,
        )
    }

    private fun updateOptionalText(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            optionalText = text,
        )
    }

    private fun updateCaption(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            captionText = text,
        )
    }

    private fun updateCounter(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            counterText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            placeholderText = text,
        )
    }

    private fun updateVariant(variant: TextFieldVariant) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            variant = variant,
        )
    }

    private fun updateState(state: State) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            state = state,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateReadOnlyState(readonly: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            readOnly = readonly,
        )
    }

    private fun updateStartIcon(hasIcon: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            hasStartIcon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            hasEndIcon = hasIcon,
        )
    }

    private fun updateChipsCount(count: Int) {
        if (count < 0) return
        _textFieldUiState.value = _textFieldUiState.value.copy(chips = List(count) { "chip $it" })
    }

    private fun updateSingleLine(singleLine: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(singleLine = singleLine)
    }

    private fun updatePrefix(prefix: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(prefix = prefix)
    }

    private fun updateSuffix(suffix: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(suffix = suffix)
    }

    private fun updateClear(isClear: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(isClear = isClear)
    }

    @Suppress("LongMethod")
    private fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "singleLine",
                value = singleLine,
                onApply = { updateSingleLine(it) },
            ),
            Property.BooleanProperty(
                name = "isClear",
                value = isClear,
                onApply = { updateClear(it) },
            ),
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
            enumProperty(
                name = "variant",
                value = variant,
                onApply = { updateVariant(it) },
            ),
            enumProperty(
                name = "state",
                value = state,
                onApply = { updateState(it) },
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
        if (_textFieldUiState.value.chips.isEmpty()) return
        _textFieldUiState.value = _textFieldUiState.value.copy(
            chips = _textFieldUiState.value.chips.dropLast(1),
        )
    }

    fun onChipClosePressed(chipToRemove: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            chips = _textFieldUiState.value.chips.filterNot { it == chipToRemove },
        )
    }
}
