package com.sdds.playground.sandbox.badge.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.StylesProviderView
import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property

/**
 * ViewModel для экранов с компонентом Badge и IconBadge
 */
internal class IconBadgeParametersViewModel(
    defaultState: BadgeUiState,
) : ComponentViewModel<BadgeUiState>(defaultState) {

    override fun getStyleProvider(stylesProvider: StylesProviderView): ViewStyleProvider<String> {
        return stylesProvider.iconBadge
    }

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return emptyList()
    }
}

/**
 * Фабрика [BadgeParametersViewModel]
 */
internal class IconBadgeParametersViewModelFactory(
    private val defaultState: BadgeUiState,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IconBadgeParametersViewModel(defaultState) as T
    }
}
