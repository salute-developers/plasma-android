package com.sdds.playground.sandbox.checkbox.compose

import androidx.compose.ui.state.ToggleableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом CheckBox
 */
internal class CheckBoxViewModel(
    defaultState: CheckBoxUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<CheckBoxUiState, CheckBoxStyle>(defaultState), PropertiesOwner {

    fun updateState(state: ToggleableState) {
        internalUiState.value = internalUiState.value.copy(state = state)
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

    override fun CheckBoxUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "state",
                value = state,
                onApply = { updateState(it) },
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

    override fun getStyleProvider(): ComposeStyleProvider<String, CheckBoxStyle> {
        return theme.stylesProvider.checkBox
    }
}

internal class CheckBoxViewModelFactory(
    private val defaultState: CheckBoxUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CheckBoxViewModel(defaultState, theme) as T
    }
}
