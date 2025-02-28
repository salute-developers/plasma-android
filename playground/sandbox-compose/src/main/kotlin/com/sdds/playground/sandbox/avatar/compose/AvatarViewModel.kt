package com.sdds.playground.sandbox.avatar.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class AvatarViewModel(
    defaultState: AvatarUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<AvatarUiState, AvatarStyle>(defaultState) {

    private fun updateDisplayType(type: ExampleMode) {
        internalUiState.value = internalUiState.value.copy(exampleMode = type)
    }

    private fun updateStatus(status: Avatar.Status) {
        internalUiState.value = internalUiState.value.copy(status = status)
    }

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                Avatar.Placeholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateActionEnabledState(enabled: Boolean) {
        internalUiState.value = internalUiState.value.copy(actionEnabled = enabled)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = "exampleMode",
                value = exampleMode,
                onApply = { updateDisplayType(it) },
            ),
            enumProperty(
                name = "status",
                value = status,
                onApply = { updateStatus(it) },
            ),
            Property.StringProperty(
                name = "placeholder",
                value = placeholder?.name.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ),
            Property.BooleanProperty(
                name = "actionEnabled",
                value = actionEnabled,
                onApply = { updateActionEnabledState(it) },
            ),
        )
    }

    override fun getStyleProvider(): ComposeStyleProvider<String, AvatarStyle> {
        return theme.stylesProvider.avatar
    }

    companion object {

        val Avatar.Placeholder.name get() = (this as? Avatar.Placeholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarViewModel]
 */
internal class AvatarViewModelFactory(
    private val defaultState: AvatarUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarViewModel(defaultState, theme) as T
    }
}
