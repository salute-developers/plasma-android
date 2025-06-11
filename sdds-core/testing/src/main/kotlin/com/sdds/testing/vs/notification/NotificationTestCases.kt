package com.sdds.testing.vs.notification

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.overlays.OverlayPosition

/**
 * Тест-кейсы для компонента [Notifcation]
 */
@Suppress("UndocumentedPublicFunction")
abstract class NotificationTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-2048
     */
    abstract fun testNotificationCompactLTopStartHasClose()

    /**
     * PLASMA-2049
     */
    abstract fun testNotificationCompactMTopCenterHasCloseFocusable()

    /**
     * PLASMA-2050
     */
    abstract fun testNotificationCompactSTopEnd()

    /**
     * PLASMA-2051
     */
    abstract fun testNotificationCompactLCenterStartHasClose()

    /**
     * PLASMA-2052
     */
    abstract fun testNotificationLooseLCenterHasClose()

    /**
     * PLASMA-2053
     */
    abstract fun testNotificationLooseMCenterEndHasClose()

    /**
     * PLASMA-2054
     */
    abstract fun testNotificationLooseSBottomStart()

    /**
     * PLASMA-2055
     */
    abstract fun testNotificationLooseBottomCenterHasCloseFocusable()

    /**
     * PLASMA-2056
     */
    abstract fun testNotificationLooseLBottomEndHasClose()

    fun ComponentScope.notificationCompactLTopStartHasClose(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.TopStart,
                autoDismiss = false,
                focusable = false,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationCompactMTopCenterHasCloseFocusable(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.TopCenter,
                autoDismiss = false,
                focusable = true,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationCompactSTopEnd(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.TopEnd,
                autoDismiss = false,
                focusable = false,
                hasClose = false,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationCompactLCenterStartHasClose(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.CenterStart,
                autoDismiss = false,
                focusable = false,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationLooseLCenterHasClose(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.Center,
                autoDismiss = false,
                focusable = false,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationLooseMCenterEndHasClose(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.CenterEnd,
                autoDismiss = false,
                focusable = false,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationLooseSBottomStart(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.BottomStart,
                autoDismiss = false,
                focusable = false,
                hasClose = false,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationLooseBottomCenterHasCloseFocusable(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.BottomCenter,
                autoDismiss = false,
                focusable = true,
                hasClose = true,
                hasAnimation = false,
            ),
        )

    fun ComponentScope.notificationLooseLBottomEndHasClose(style: Int) =
        notificationTrigger(
            context = context,
            style = style,
            state = NotificationUiState(
                variant = "",
                text = "Notification text",
                position = OverlayPosition.BottomEnd,
                autoDismiss = false,
                focusable = false,
                hasClose = true,
                hasAnimation = false,
            ),
        )
}
