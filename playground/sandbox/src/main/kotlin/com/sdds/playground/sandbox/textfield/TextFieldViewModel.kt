package com.sdds.playground.sandbox.textfield

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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
 * @param mode режим работы компонента
 * @param defaultState состояние компонента по умолчанию
 * @see Mode
 */
internal class TextFieldViewModel(
    private val mode: Mode,
    private val defaultState: TextFieldUiState,
) : ViewModel(), PropertiesOwner {

    private val _textFieldUiState = MutableStateFlow(defaultState)
    private val _chips = MutableStateFlow(defaultState.chipData)

    /**
     * Состояние компонента [TextField]
     */
    val textFieldUiState: StateFlow<TextFieldUiState>
        get() = _textFieldUiState.asStateFlow()

    /**
     * Данные для чипов компонента [TextField]
     */
    val chips: StateFlow<List<ExampleChipData>>
        get() = _chips.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val properties: StateFlow<List<Property<*>>> =
        _textFieldUiState
            .mapLatest { state -> state.toProps() }
            .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        val pName = TextFieldPropertyName.values().find { it.value == name }
        when (pName) {
            TextFieldPropertyName.Variant -> updateVariant(value)
            TextFieldPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            TextFieldPropertyName.Caption -> updateCaption(value?.toString().orEmpty())
            TextFieldPropertyName.Counter -> updateCounter(value?.toString().orEmpty())
            TextFieldPropertyName.Placeholder -> updatePlaceholder(value?.toString().orEmpty())
            TextFieldPropertyName.State -> updateState(TextField.FieldState.valueOf(value?.toString() ?: return))
            TextFieldPropertyName.Icon -> updateStartIcon(value as Boolean)
            TextFieldPropertyName.Action -> updateEndIcon(value as Boolean)
            TextFieldPropertyName.Enabled -> updateEnabledState(value as Boolean)
            TextFieldPropertyName.ReadOnly -> updateReadOnlyState(value as Boolean)
            TextFieldPropertyName.HasChips -> updateHasChips(value as Boolean)
            TextFieldPropertyName.Prefix -> updatePrefix(value?.toString())
            TextFieldPropertyName.Suffix -> updateSuffix(value?.toString())
            else -> Unit
        }
    }

    override fun resetToDefault() {
        _textFieldUiState.value = defaultState
    }

    /**
     * Удаляем чип по индексу
     */
    fun deleteChip(index: Int): ExampleChipData? {
        if (index < 0 || index >= chips.value.size) return null
        val chipsList = _chips.value.toMutableList()
        val chip = chipsList[index]
        chipsList.removeAt(index)
        _chips.value = chipsList
        return chip
    }

    /**
     * Добавляет чип с текстом
     */
    fun addChip(text: String): Boolean {
        if (text.isEmpty() || !_textFieldUiState.value.hasChips) return false
        val chipsList = _chips.value.toMutableList()
        chipsList.add(ExampleChipData(text))
        _chips.value = chipsList
        return true
    }

    private fun updateVariant(variant: Any?) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            variant = when (mode) {
                Mode.TextField -> TextFieldVariant.valueOf(variant?.toString() ?: return)
                Mode.TextArea -> TextAreaVariant.valueOf(variant?.toString() ?: return)
            },
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

    private fun updateState(state: TextField.FieldState) {
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
            icon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            action = hasIcon,
        )
    }

    private fun updateHasChips(hasChips: Boolean) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            hasChips = hasChips,
        )
    }

    private fun updatePrefix(prefix: String?) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            prefix = prefix,
        )
    }

    private fun updateSuffix(suffix: String?) {
        _textFieldUiState.value = _textFieldUiState.value.copy(
            suffix = suffix?.takeIf { it.isNotBlank() },
        )
    }

    @Suppress("LongMethod")
    private fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            when (mode) {
                Mode.TextField -> enumProperty(
                    name = TextFieldPropertyName.Variant.value,
                    value = variant as TextFieldVariant,
                )

                Mode.TextArea -> enumProperty(
                    name = TextFieldPropertyName.Variant.value,
                    value = variant as TextAreaVariant,
                )
            },
            Property.StringProperty(
                name = TextFieldPropertyName.Label.value,
                value = labelText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Caption.value,
                value = captionText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Counter.value,
                value = counterText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Placeholder.value,
                value = placeholderText,
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Prefix.value,
                value = prefix.orEmpty(),
            ),
            Property.StringProperty(
                name = TextFieldPropertyName.Suffix.value,
                value = suffix.orEmpty(),
            ),
            enumProperty(
                name = TextFieldPropertyName.State.value,
                value = state,
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
            Property.BooleanProperty(
                name = TextFieldPropertyName.HasChips.value,
                value = hasChips,
            ),
        )
    }

    enum class Mode {
        TextField,
        TextArea,
    }

    private enum class TextFieldPropertyName(val value: String) {
        Variant("variant"),
        Label("label"),
        Caption("caption"),
        Counter("counter"),
        Placeholder("placeholder"),
        State("state"),
        Icon("icon"),
        Action("action"),
        Enabled("enabled"),
        ReadOnly("read only"),
        HasChips("has chips"),
        Prefix("prefix"),
        Suffix("suffix"),
    }
}

/**
 * Фабрика для [TextFieldViewModel]
 * @param mode режим работы компонента
 * @param defaultState состояние компонента по умолчанию
 */
internal class TextFieldViewModelFactory(
    private val mode: TextFieldViewModel.Mode,
    private val defaultState: TextFieldUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TextFieldViewModel(mode, defaultState) as T
    }
}
