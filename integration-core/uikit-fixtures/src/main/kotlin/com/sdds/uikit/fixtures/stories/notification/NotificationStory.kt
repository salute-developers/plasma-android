package com.sdds.uikit.fixtures.stories.notification

import android.content.Context
import android.view.View
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.ViewBaseStory
import com.sdds.uikit.fixtures.stories.NotificationUiStatePropertiesProducer
import com.sdds.uikit.fixtures.stories.NotificationUiStateTransformer

/**
 * История компонента Notification для сторибука.
 *
 * Демонстрирует все возможные состояния и конфигурации Notification.
 *
 * @see Story
 * @see ViewBaseStory
 * @see ComponentKey.Notification
 */
@Story
object NotificationStory : ViewBaseStory<NotificationUiState, View>(
    ComponentKey.Notification,
    NotificationUiState(),
    NotificationUiStatePropertiesProducer,
    NotificationUiStateTransformer,
) {
    override fun getComponent(context: Context): View {
        return notificationTrigger(context)
    }

    override fun onComponentUpdate(component: View, state: NotificationUiState) {
        component.setOnClickListener { notification(component.context, state).show() }
    }
}
