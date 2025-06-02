package com.sdds.testing.vs.notification

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.getTextColorPrimary
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.CellLayout
import com.sdds.uikit.Notification
import com.sdds.uikit.TextView
import com.sdds.uikit.overlays.OverlayManager

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
        isFocusable = state.focusable,
//        animationSpec = OverlayAnimationSpec.NoAnimation
    ) { ctx, _ ->
        if (state.focusable) {
            focusableNotificationContent(context, state)
        } else {
            notificationContent(context, state)
        }
    }
}

private fun notificationContent(context: Context, state: NotificationUiState): View {
    return TextView(context).apply {
        text = state.text
        setTextColor(context.getTextColorPrimary())
    }
}

private fun focusableNotificationContent(context: Context, state: NotificationUiState): View {
    val textView = TextView(context).apply {
        text = state.text
        setTextColor(context.getTextColorPrimary())
    }
    val button = basicButton(context).apply {
        text = "Action"
        layoutParams = CellLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT).apply {
            cellContent = CellLayout.CellContent.END
        }
    }
    return CellLayout(context).apply {
        clipChildren = false
        addView(textView)
        addView(button)
    }
}
