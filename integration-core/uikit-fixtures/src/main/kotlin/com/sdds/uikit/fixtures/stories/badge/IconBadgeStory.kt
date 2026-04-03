package com.sdds.uikit.fixtures.stories.badge

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.IconBadge
import com.sdds.uikit.fixtures.stories.BadgeUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.BadgeUiStateTransformer

/**
 * История компонента IconBadge для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации IconBadge.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.IconBadge
 */
@Story
object IconBadgeStory : ViewBaseStory<BadgeUiState, IconBadge>(
    ComponentKey.IconBadge,
    BadgeUiState(),
    BadgeUiStatePropertiesProducer,
    BadgeUiStateTransformer,
) {
    override fun getComponent(context: Context): IconBadge {
        return iconBadge(context)
    }

    override fun onComponentUpdate(component: IconBadge, state: BadgeUiState) {
        component.applyState(state)
    }
}
