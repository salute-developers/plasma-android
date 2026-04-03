package com.sdds.uikit.fixtures.stories.chip

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Chip
import com.sdds.uikit.fixtures.stories.ChipUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.ChipUiStateTransformer

/**
 * История компонента Chip для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Chip.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Chip
 */
@Story
object ChipStory : ViewBaseStory<ChipUiState, Chip>(
    ComponentKey.Chip,
    ChipUiState(),
    ChipUiStatePropertiesProducer,
    ChipUiStateTransformer,
) {
    override fun getComponent(context: Context): Chip {
        return chip(context)
    }

    override fun onComponentUpdate(component: Chip, state: ChipUiState) {
        component.applyState(state)
    }
}
