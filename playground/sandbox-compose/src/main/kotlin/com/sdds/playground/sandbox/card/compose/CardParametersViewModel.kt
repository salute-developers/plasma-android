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
            Property.StringProperty(
                name = "label",
                value = label,
                onApply = { updateLabel(it) },
            ),
            Property.BooleanProperty(
                name = "hasExtra",
                value = hasExtra,
                onApply = { updateHasExtra(it) },
            ),
        )
    }

    private fun updateOrientation(orientation: Orientation) {
        internalUiState.value = internalUiState.value.copy(
            orientation = orientation,
        )
    }

    private fun updateLabel(label: String) {
        internalUiState.value = internalUiState.value.copy(
            label = label,
        )
    }

    private fun updateHasExtra(hasExtra: Boolean) {
        internalUiState.value = internalUiState.value.copy(
            hasExtra = hasExtra,
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
