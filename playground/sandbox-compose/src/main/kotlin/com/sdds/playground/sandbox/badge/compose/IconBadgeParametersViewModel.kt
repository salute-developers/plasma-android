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
 * ViewModel для экранов с компонентом IconBadge
 */
internal class IconBadgeParametersViewModel(
    defaultState: BadgeUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ComponentViewModel<BadgeUiState, BadgeStyle>(defaultState) {

    private fun updateView(view: BadgeType) {
        internalUiState.value = internalUiState.value.copy(type = view)
    }

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "type",
                value = type,
                onApply = { updateView(it) },
            ),
        )
    }

    override fun getStyleProvider(): ComposeStyleProvider<String, BadgeStyle> {
        return when (internalUiState.value.type) {
            BadgeType.Solid -> theme.stylesProvider.iconBadgeSolid
            BadgeType.Clear -> theme.stylesProvider.iconBadgeClear
            BadgeType.Transparent -> theme.stylesProvider.iconBadgeTransparent
        }
    }
}

/**
 * Фабрика [IconBadgeParametersViewModel]
 */
internal class IconBadgeParametersViewModelFactory(
    private val defaultState: BadgeUiState,
    private val theme: Theme.ThemeInfoCompose,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconBadgeParametersViewModel(defaultState, theme) as T
    }
}
