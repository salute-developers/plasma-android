package com.sdds.uikit.fixtures.stories.card

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Card
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.CardUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.CardUiStateTransformer

/**
 * История компонента Card для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Card.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Card
 */
@Story
object CardStory : ViewBaseStory<CardUiState, Card>(
    ComponentKey.Card,
    CardUiState(),
    CardUiStatePropertiesProducer,
    CardUiStateTransformer,
) {
    override fun getComponent(context: Context): Card {
        return card(context).apply { id = R.id.card }
    }

    override fun onComponentUpdate(component: Card, state: CardUiState) {
        component.applyState(state)
    }
}
