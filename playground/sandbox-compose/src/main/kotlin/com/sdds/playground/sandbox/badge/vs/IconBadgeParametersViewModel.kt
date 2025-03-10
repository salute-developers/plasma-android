package com.sdds.playground.sandbox.badge.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.testing.vs.badge.BadgeUiState

/**
 * ViewModel для экранов с компонентом Badge и IconBadge
 */
internal class IconBadgeParametersViewModel(
    defaultState: BadgeUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BadgeUiState>(defaultState, componentKey) {

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

/**
 * Фабрика [BadgeParametersViewModel]
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
