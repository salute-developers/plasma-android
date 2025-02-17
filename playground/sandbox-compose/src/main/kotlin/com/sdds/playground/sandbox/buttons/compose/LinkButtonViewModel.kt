package com.sdds.playground.sandbox.buttons.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом BasicButton и IconButton
 */
internal class LinkButtonViewModel(
    defaultState: ButtonUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<ButtonUiState, ButtonStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, ButtonStyle> {
        return theme.stylesProvider.linkButton
    }

    private fun updateIcon(icon: ButtonIcon) {
        internalUiState.value = internalUiState.value.copy(
            icon = icon,
        )
    }

    private fun updateLabel(label: String) {
        internalUiState.value = internalUiState.value.copy(
            buttonLabel = label,
        )
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
            Property.SingleChoiceProperty(
                name = "icon",
                value = icon::class.simpleName.orEmpty(),
                variants = listOf(
                    ButtonIcon.Start::class.simpleName.orEmpty(),
                    ButtonIcon.End::class.simpleName.orEmpty(),
                    ButtonIcon.No::class.simpleName.orEmpty(),
                ),
                onApply = { variantName ->
                    updateIcon(
                        when (variantName) {
                            ButtonIcon.Start::class.simpleName -> ButtonIcon.Start
                            ButtonIcon.End::class.simpleName -> ButtonIcon.End
                            else -> ButtonIcon.No
                        },
                    )
                },
            ),

            Property.StringProperty(
                name = "buttonLabel",
                value = buttonLabel,
                onApply = { updateLabel(it) },
            ),
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
internal class LinkButtonViewModelFactory(
    private val defaultState: ButtonUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LinkButtonViewModel(defaultState, theme) as T
    }
}
