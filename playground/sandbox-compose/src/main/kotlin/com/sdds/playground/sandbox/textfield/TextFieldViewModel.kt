package com.sdds.playground.sandbox.textfield

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.TextField.DotBadge
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

    private fun updateLabelOptional(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            labelOptionalText = text,
        )
    }

    private fun updateCaption(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            captionText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            captionText = text,
        )
    }

    private fun updateState(state: SandboxTextField.State) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            state = state,
        )
    }

    private fun updateSize(size: SandboxTextField.Size) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            size = size,
        )
    }

    private fun updateLabelType(labelType: TextField.LabelType) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            labelType = labelType,
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

    private fun updateHasDotBadge(hasDotBadge: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            hasDotBadge = hasDotBadge,
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

    private fun updateDotBadgePosition(dotBadgePosition: DotBadge.Position) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            dotBadgePosition = dotBadgePosition,
        )
    }

    @Suppress("LongMethod")
    private fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.StringProperty(
                name = "label",
                value = labelText,
                onApply = { updateLabel(it) },
            ),
            Property.StringProperty(
                name = "label optional",
                value = labelOptionalText,
                onApply = { updateLabelOptional(it) },
            ),
            Property.StringProperty(
                name = "caption",
                value = captionText,
                onApply = { updateCaption(it) },
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
            Property.BooleanProperty(
                name = "has dot badge",
                value = hasDotBadge,
                onApply = { updateHasDotBadge(it) },
            ),
            enumProperty(
                name = "dot badge position",
                value = dotBadgePosition,
                onApply = {
                    updateDotBadgePosition(it)
                },
            ),
        )
    }
}
