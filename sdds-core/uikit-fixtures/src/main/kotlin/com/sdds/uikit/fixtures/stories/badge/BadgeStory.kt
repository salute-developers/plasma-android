package com.sdds.uikit.fixtures.stories.badge

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Badge
import com.sdds.uikit.fixtures.stories.BadgeUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.BadgeUiStateTransformer

/**
 * История компонента Badge для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Badge.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Badge
 */
@Story
object BadgeStory : ViewBaseStory<BadgeUiState, Badge>(
    ComponentKey.Badge,
    BadgeUiState(),
    BadgeUiStatePropertiesProducer,
    BadgeUiStateTransformer,
) {
    override fun getComponent(context: Context): Badge {
        return badge(context)
    }

    override fun onComponentUpdate(component: Badge, state: BadgeUiState) {
        component?.applyState(state)
    }
}
