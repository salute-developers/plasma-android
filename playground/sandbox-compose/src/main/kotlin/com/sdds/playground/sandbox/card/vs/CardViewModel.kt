package com.sdds.playground.sandbox.card.vs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentViewModel
import com.sdds.playground.sandbox.core.vs.Property
import com.sdds.playground.sandbox.core.vs.enumProperty
import com.sdds.testing.vs.card.CardOrientation
import com.sdds.testing.vs.card.CardUiState

/**
 * ViewModel компонента Card
 * @author Малышев Александр on 14.08.2025
 */
internal class CardViewModel(
    defaultState: CardUiState,
    componentKey: ComponentKey,
) : ComponentViewModel<CardUiState>(defaultState, componentKey) {

    override fun updateProperty(name: String, value: Any?) {
        super.updateProperty(name, value)

        val valueString = value?.toString() ?: return
        val propertyName = CardPropertyName.values().find { it.value == name }
        val currentState = internalUiState.value
        internalUiState.value = when (propertyName) {
            CardPropertyName.Orientation -> currentState.copy(orientation = CardOrientation.valueOf(valueString))
            else -> currentState
        }
    }

    override fun CardUiState.toProps(): List<Property<*>> {
        return listOf(
            enumProperty(
                name = CardPropertyName.Orientation.value,
                value = orientation,
            ),
        )
    }

    private enum class CardPropertyName(val value: String) {
        Orientation("orientation"),
    }
}

/**
 * Фабрика для [CardViewModel]
 */
internal class CardViewModelFactory(
    private val defaultState: CardUiState,
    private val componentKey: ComponentKey,
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CardViewModel(defaultState, componentKey) as T
    }
}
