package com.sdds.testing.vs.notification

import android.content.Context
import android.view.View
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.notificationcontent.NotificationContentUiState
import com.sdds.testing.vs.notificationcontent.notificationContent
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Notification
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.getAnimationSpec

/**
 * Создает [Notification] с тригером.
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun notificationTrigger(
    context: Context,
    style: Int? = null,
    state: NotificationUiState = NotificationUiState(),
): View {
    val trigger = basicButton(context).apply {
        text = "Show Notification"
        setOnClickListener { notification(context.styleWrapper(style), state).show() }
    }
    return trigger
}

/**
 * Создает [Notification]
 * @param context контекст
 * @param state состояние
 */
fun notification(
    context: Context,
    state: NotificationUiState,
): Notification {
    return Notification.makeNotification(
        context = context,
        position = state.position,
        duration = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS.takeIf { state.autoDismiss },
        animationSpec = state.position.getAnimationSpec().takeIf { state.hasAnimation },
        isFocusable = state.focusable,
        hasClose = state.hasClose,
    ) { ctx, _ ->
        notificationContent(
            context = ctx,
            state = NotificationContentUiState(
                text = state.text,
                hasActions = state.focusable,
            ),
        ).apply {
            clipChildren = false
            isFocusable = false
            isFocusableInTouchMode = false
        }
    }
}
