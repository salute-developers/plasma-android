package com.sdds.uikit.fixtures.stories.notificationcontent

import android.content.Context
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.NotificationContent
import com.sdds.uikit.fixtures.stories.NotificationContentUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.NotificationContentUiStateTransformer

/**
 * История компонента NotificationContent для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации NotificationContent.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.NotificationContent
 */
@Story
object NotificationContentStory : ViewBaseStory<NotificationContentUiState, NotificationContent>(
    ComponentKey.NotificationContent,
    NotificationContentUiState(),
    NotificationContentUiStatePropertiesProducer,
    NotificationContentUiStateTransformer,
) {
    override fun getComponent(context: Context): NotificationContent {
        return notificationContent(context)
    }

    override fun onComponentUpdate(component: NotificationContent, state: NotificationContentUiState) {
        component.applyState(state)
    }
}
