package com.sdds.playground.sandbox.avatar.compose.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.avatar.compose.AvatarUiState
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом Avatar
 */
internal class AvatarGroupViewModel(
    defaultState: AvatarUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<AvatarUiState, AvatarGroupStyle>(defaultState) {

    private fun updatePlaceholder(text: String) {
        internalUiState.value = internalUiState.value.copy(
            placeholder = if (text.isNotBlank()) {
                Avatar.Placeholder.Name(text)
            } else {
                null
            },
        )
    }

    private fun updateThreshold(threshold: Int) {
        internalUiState.value = internalUiState.value.copy(threshold = threshold)
    }

    override fun AvatarUiState.toProps(): List<Property<*>> {
        return listOf(
            Property.StringProperty(
                name = "placeholder",
                value = placeholder?.name.orEmpty(),
                onApply = { updatePlaceholder(it) },
            ),
            Property.IntProperty(
                name = "threshold",
                value = threshold,
                onApply = { updateThreshold(it) },
            ),
        )
    }

    override fun getStyleProvider(): ComposeStyleProvider<String, AvatarGroupStyle> {
        return theme.stylesProvider.avatarGroup
    }

    companion object {
        val Avatar.Placeholder.name get() = (this as? Avatar.Placeholder.Name)?.fullName
    }
}

/**
 * Фабрика [AvatarGroupViewModel]
 */
internal class AvatarGroupViewModelFactory(
    private val defaultState: AvatarUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvatarGroupViewModel(defaultState, theme) as T
    }
}
