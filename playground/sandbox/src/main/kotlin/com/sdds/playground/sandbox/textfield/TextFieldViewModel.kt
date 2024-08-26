package com.sdds.playground.sandbox.textfield

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sdds.playground.sandbox.core.view.PropertiesOwner
import com.sdds.playground.sandbox.core.view.Property
import com.sdds.playground.sandbox.core.view.enumProperty
import com.sdds.uikit.TextField
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

/**
 * [ViewModel] компонента [TextField]
 */
internal class TextFieldViewModel : ViewModel(), PropertiesOwner {

    private val _textFieldUiState = MutableStateFlow(TextFieldUiState())

    /**
     * Состояние компонента [TextField]
     */
    val textFieldUiState: StateFlow<TextFieldUiState>
        get() = _textFieldUiState.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _textFieldUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        val pName = TextFieldPropertyName.values().find { it.value == name }
        when (pName) {
            TextFieldPropertyName.Variant -> updateVariant(TextFieldVariant.valueOf(value?.toString() ?: return))
            TextFieldPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            TextFieldPropertyName.Caption -> updateCaption(value?.toString().orEmpty())
            TextFieldPropertyName.Placeholder -> updatePlaceholder(value?.toString().orEmpty())
            TextFieldPropertyName.State -> updateState(TextField.FieldState.valueOf(value?.toString() ?: return))
            TextFieldPropertyName.LabelType -> updateLabelType(TextField.LabelType.valueOf(value?.toString() ?: return))
            TextFieldPropertyName.Icon -> updateStartIcon(value as Boolean)
            TextFieldPropertyName.Action -> updateEndIcon(value as Boolean)
            TextFieldPropertyName.Enabled -> updateEnabledState(value as Boolean)
            TextFieldPropertyName.ReadOnly -> updateReadOnlyState(value as Boolean)
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _textFieldUiState.value = TextFieldUiState()
    }

    private fun updateVariant(variant: TextFieldVariant) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            variant = variant,
        )
    }

    private fun updateLabel(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            labelText = text,
        )
    }

    private fun updateCaption(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            captionText = text,
        )
    }

    private fun updatePlaceholder(text: String) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            placeholderText = text,
        )
    }

    private fun updateState(state: TextField.FieldState) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            state = state,
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

    private fun updateStartIcon(hasIcon: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            icon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            action = hasIcon,
        )
    }

    @Suppress("LongMethod")
    private fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = TextFieldPropertyName.Variant.value,
                value = variant,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Label.value,
                value = labelText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Caption.value,
                value = captionText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Placeholder.value,
                value = placeholderText,
            ),
            enumProperty(
                name = TextFieldPropertyName.State.value,
                value = state,
            ),
            enumProperty(
                name = TextFieldPropertyName.LabelType.value,
                value = labelType,
            ),
            Property.BooleanProperty(
                name = TextFieldPropertyName.Icon.value,
                value = icon,
            ),
            Property.BooleanProperty(
                name = TextFieldPropertyName.Action.value,
                value = action,
            ),
            Property.BooleanProperty(
                name = TextFieldPropertyName.Enabled.value,
                value = enabled,
            ),
            Property.BooleanProperty(
                name = TextFieldPropertyName.ReadOnly.value,
                value = readOnly,
            ),
        )
    }

    private enum class TextFieldPropertyName(val value: String) {
        Variant("variant"),
        Label("label"),
        Caption("caption"),
        Placeholder("placeholder"),
        State("state"),
        LabelType("label type"),
        Icon("icon"),
        Action("action"),
        Enabled("enabled"),
        ReadOnly("read only"),
    }
}
