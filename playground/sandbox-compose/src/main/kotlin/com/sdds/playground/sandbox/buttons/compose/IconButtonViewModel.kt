package com.sdds.playground.sandbox.buttons.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом IconButton
 */
internal class IconButtonViewModel(
    defaultState: ButtonUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<ButtonUiState, ButtonStyle>(defaultState), PropertiesOwner {

    override fun getStyleProvider(): ComposeStyleProvider<String, ButtonStyle> {
        return theme.stylesProvider.iconButton
    }

    private fun updateEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            enabled = enabled,
        )
    }

    private fun updateLoadingState(loading: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            loading = loading,
        )
    }

    override fun ButtonUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            Property.BooleanProperty(
                name = "enabled",
                value = enabled,
                onApply = { updateEnabledState(it) },
            ),
            Property.BooleanProperty(
                name = "loading",
                value = loading,
                onApply = { updateLoadingState(it) },
            ),
        )
    }
}

/**
 * Фабрика [ButtonViewModel]
 */
internal class IconButtonViewModelFactory(
    private val defaultState: ButtonUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconButtonViewModel(defaultState, theme) as T
    }
}
