package com.sdds.playground.sandbox.switcher.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом Switch
 */
internal class SwitchViewModel(
    defaultState: SwitchUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<SwitchUiState, SwitchStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, SwitchStyle> {
        return theme.stylesProvider.switch
    }

    fun updateActive(active: Boolean) {
        internalUiState.value = internalUiState.value.copy(active = active)
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

    override fun SwitchUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "active",
                value = active,
                onApply = { updateActive(it) },
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

internal class SwitchViewModelFactory(
    private val defaultState: SwitchUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SwitchViewModel(defaultState, theme) as T
    }
}
