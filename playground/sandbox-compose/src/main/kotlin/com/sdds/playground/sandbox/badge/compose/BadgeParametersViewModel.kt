package com.sdds.playground.sandbox.badge.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

/**
 * ViewModel для экранов с компонентом Badge
 */
internal class BadgeParametersViewModel(
    defaultState: BadgeUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<BadgeUiState, BadgeStyle>(defaultState) {

    override fun getStyleProvider(): ComposeStyleProvider<String, BadgeStyle> {
        return when (internalUiState.value.type) {
            BadgeType.Solid -> theme.stylesProvider.badgeSolid
            BadgeType.Clear -> theme.stylesProvider.badgeClear
            BadgeType.Transparent -> theme.stylesProvider.badgeTransparent
        }
    }

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text)
    }

    private fun updateView(view: BadgeType) {
        internalUiState.value = internalUiState.value.copy(type = view)
    }

    private fun updateContentLeft(contentLeft: Boolean) {
        internalUiState.value = internalUiState.value.copy(contentLeft = contentLeft)
    }

    private fun updateContentRight(contentRight: Boolean) {
        internalUiState.value = internalUiState.value.copy(contentRight = contentRight)
    }

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "type",
                value = type,
                onApply = { updateView(it) },
            ),

            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { updateLabel(it) },
            ),

            Property.BooleanProperty(
                name = "left content",
                value = contentLeft,
                onApply = { updateContentLeft(it) },
            ),

            Property.BooleanProperty(
                name = "right content",
                value = contentRight,
                onApply = { updateContentRight(it) },
            ),

        )
    }
}

/**
 * Фабрика [BadgeParametersViewModel]
 */
internal class BadgeParametersViewModelFactory(
    private val defaultState: BadgeUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BadgeParametersViewModel(defaultState, theme) as T
    }
}
