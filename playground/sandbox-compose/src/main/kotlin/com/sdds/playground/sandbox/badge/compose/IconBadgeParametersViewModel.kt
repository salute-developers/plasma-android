package com.sdds.playground.sandbox.badge.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом IconBadge
 */
internal class IconBadgeParametersViewModel(
    defaultState: BadgeUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BadgeUiState, BadgeStyle>(defaultState, componentKey) {

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

/**
 * Фабрика [IconBadgeParametersViewModel]
 */
internal class IconBadgeParametersViewModelFactory(
    private val defaultState: BadgeUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconBadgeParametersViewModel(defaultState, componentKey) as T
    }
}
