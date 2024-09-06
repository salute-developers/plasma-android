package com.sdds.playground.sandbox.textarea

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.TextField
import com.sdds.playground.sandbox.core.PropertiesOwner
import com.sdds.playground.sandbox.core.Property
import com.sdds.playground.sandbox.core.enumProperty
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

internal class TextAreaViewModel : ViewModel(), PropertiesOwner {

    private val _textAreaUiState = MutableStateFlow(TextAreaUiState())

    val textAreaUiState: StateFlow<TextAreaUiState>
        get() = _textAreaUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _textAreaUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun onValueChange(textFieldValue: TextFieldValue) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            value = textFieldValue,
        )
    }

    private fun updateLabel(text: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            labelText = text,
        )
    }

    private fun updateOptionalText(text: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            optionalText = text,
        )
    }

    private fun updateCaption(text: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            captionText = text,
        )
    }

    private fun updateCounter(text: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            counterText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            placeholderText = text,
        )
    }

    private fun updateState(state: SandboxTextArea.State) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            state = state,
        )
    }

    private fun updateSize(size: SandboxTextArea.Size) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            size = size,
        )
    }

    private fun updateLabelType(labelType: TextField.LabelType) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            labelType = labelType,
        )
    }

    private fun updateEnabledState(enabled: Boolean) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateReadOnlyState(readonly: Boolean) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            readOnly = readonly,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            hasIcon = hasIcon,
        )
    }

    private fun updateDotBadgePosition(dotBadgePosition: TextField.DotBadge.Position) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            dotBadgePosition = dotBadgePosition,
        )
    }

    private fun updateFieldType(fieldType: SandboxTextArea.FieldType) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            fieldType = fieldType,
        )
    }

    private fun updateChipsCount(count: Int) {
        if (count < 0) return
        _textAreaUiState.value = _textAreaUiState.value.copy(chips = List(count) { "chip $it" })
    }

    @Suppress("LongMethod")
    private fun TextAreaUiState.toProps(): List<Property<*>> {
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
            enumProperty(
                name = "field type",
                value = fieldType,
                onApply = { updateFieldType(it) },
            ),
            enumProperty(
                name = "dot badge position",
                value = dotBadgePosition,
                onApply = {
                    updateDotBadgePosition(it)
                },
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
                name = "state",
                value = state,
                onApply = { updateState(it) },
            ),
            enumProperty(
                name = "size",
                value = size,
                onApply = { updateSize(it) },
            ),
            enumProperty(
                name = "label type",
                value = labelType,
                onApply = { updateLabelType(it) },
            ),
            Property.BooleanProperty(
                name = "icon",
                value = hasIcon,
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
        )
    }

    override fun resetToDefault() {
        _textAreaUiState.value = TextAreaUiState()
    }

    fun onChipClosePressed(chipToRemove: String) {
        _textAreaUiState.value = _textAreaUiState.value.copy(
            chips = _textAreaUiState.value.chips.filterNot { it == chipToRemove },
        )
    }
}
