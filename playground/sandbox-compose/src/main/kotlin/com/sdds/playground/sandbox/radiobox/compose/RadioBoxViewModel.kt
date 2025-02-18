package com.sdds.playground.sandbox.radiobox.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом RadioBox
 */
internal class RadioBoxViewModel(
    defaultState: RadioBoxUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<RadioBoxUiState, RadioBoxStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, RadioBoxStyle> {
        return theme.stylesProvider.radioBox
    }

    private fun updateChecked(checked: Boolean) {
        internalUiState.value = internalUiState.value.copy(checked = checked)
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text.ifEmpty { null })
    }

    private fun updateDescription(text: String) {
        internalUiState.value = internalUiState.value.copy(description = text.ifEmpty { null })
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(enabled = enabled)
    }

    override fun RadioBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "checked",
                value = checked,
                onApply = { updateChecked(it) },
            ),

            Property.StringProperty(
                name = "label",
                value = label.orEmpty(),
                onApply = { updateLabel(it) },
            ),

            Property.StringProperty(
                name = "description",
                value = description.orEmpty(),
                onApply = { updateDescription(it) },
            ),

            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),
        )
    }
}

internal class RadioBoxViewModelFactory(
    private val defaultState: RadioBoxUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RadioBoxViewModel(defaultState, theme) as T
    }
}
