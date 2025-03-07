package com.sdds.playground.sandbox.badge.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом IconBadge
 */
internal class IconBadgeParametersViewModel(
    defaultState: BadgeUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BadgeUiState, BadgeStyle>(defaultState, componentKey) {

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
