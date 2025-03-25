package com.sdds.playground.sandbox.card.compose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.compose.uikit.CardStyle
import com.sdds.playground.sandbox.core.compose.ComponentViewModel
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.playground.sandbox.core.compose.enumProperty
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * ViewModel компонента Card
 */
internal class CardParametersViewModel(
    defaultState: CardUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CardUiState, CardStyle>(defaultState, componentKey) {

    override fun CardUiState.toProps(): List<Property<*>> {
        return listOfNotNull(
            enumProperty(
                name = "orientation",
                value = orientation,
                onApply = { updateOrientation(it) },
            ),
        )
    }

    private fun updateOrientation(orientation: CardOrientation) {
        internalUiState.value = internalUiState.value.copy(
            orientation = orientation,
        )
    }
}

internal class CardParametersViewModelFactory(
    private val defaultState: CardUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CardParametersViewModel(defaultState, componentKey) as T
    }
}
