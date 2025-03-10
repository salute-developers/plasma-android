package com.sdds.playground.sandbox.badge.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel для экранов с компонентом Badge
 */
internal class BadgeParametersViewModel(
    defaultState: BadgeUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<BadgeUiState, BadgeStyle>(defaultState, componentKey) {

    private fun updateLabel(text: String) {
        internalUiState.value = internalUiState.value.copy(label = text)
    }

    private fun updateContentLeft(contentLeft: Boolean) {
        internalUiState.value = internalUiState.value.copy(contentLeft = contentLeft)
    }

    private fun updateContentRight(contentRight: Boolean) {
        internalUiState.value = internalUiState.value.copy(contentRight = contentRight)
    }

    override fun BadgeUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
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
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BadgeParametersViewModel(defaultState, componentKey) as T
    }
}
