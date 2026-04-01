package com.sdds.uikit.fixtures.stories.avatar

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.Avatar
import com.sdds.uikit.fixtures.stories.AvatarUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.AvatarUiStateTransformer

/**
 * История компонента Avatar для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Avatar.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Avatar
 */
@Story
object AvatarStory : ViewBaseStory<AvatarUiState, Avatar>(
    ComponentKey.Avatar,
    AvatarUiState(),
    AvatarUiStatePropertiesProducer,
    AvatarUiStateTransformer,
) {
    override fun getComponent(context: Context): Avatar {
        return avatar(context)
    }

    override fun onComponentUpdate(component: Avatar, state: AvatarUiState) {
        component.applyState(state)
    }
}
