package com.sdds.playground.sandbox.textfield.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.uikit.TextField
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * [ViewModel] компонента [TextArea]
 */
internal class TextAreaViewModel(
    defaultState: TextFieldUiState,
) : ComponentViewModel<TextFieldUiState>(defaultState) {

    private val _chips = MutableStateFlow(defaultState.chipData)

    /**
     * Данные для чипов компонента [TextField]
     */
    val chips: StateFlow<List<ExampleChipData>>
        get() = _chips.asStateFlow()

    @Suppress("CyclomaticComplexMethod")
    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val pName = TextFieldPropertyName.values().find { it.value == name }
        when (pName) {
            TextFieldPropertyName.Label -> updateLabel(value?.toString().orEmpty())
            TextFieldPropertyName.Caption -> updateCaption(value?.toString().orEmpty())
            TextFieldPropertyName.Counter -> updateCounter(value?.toString().orEmpty())
            TextFieldPropertyName.Placeholder -> updatePlaceholder(value?.toString().orEmpty())
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

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.textArea
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
        if (text.isEmpty() || !internalUiState.value.hasChips) return false
        val chipsList = _chips.value.toMutableList()
        chipsList.add(ExampleChipData(text))
        _chips.value = chipsList
        return true
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(
            labelText = text,
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
            icon = hasIcon,
        )
    }

    private fun updateEndIcon(hasIcon: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            action = hasIcon,
        )
    }

    private fun updateHasChips(hasChips: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasChips = hasChips,
        )
    }

    private fun updatePrefix(prefix: String?) {
        internalUiState.value = internalUiState.value.copy(
            prefix = prefix,
        )
    }

    private fun updateSuffix(suffix: String?) {
        internalUiState.value = internalUiState.value.copy(
            suffix = suffix?.takeIf { it.isNotBlank() },
        )
    }

    @Suppress("LongMethod")
    override fun TextFieldUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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

    private enum class TextFieldPropertyName(val value: String) {
        Label("label"),
        Caption("caption"),
        Counter("counter"),
        Placeholder("placeholder"),
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
 */
internal class TextAreaViewModelFactory(
    private val defaultState: TextFieldUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TextAreaViewModel(defaultState) as T
    }
}
