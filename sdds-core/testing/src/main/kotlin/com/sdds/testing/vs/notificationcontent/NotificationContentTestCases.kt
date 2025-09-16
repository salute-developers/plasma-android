package com.sdds.testing.vs.notificationcontent

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig

/**
 * Тест-кейсы для компонента [NotificationContent]
 */
@Suppress("UndocumentedPublicFunction")
abstract class NotificationContentTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2245
     */
    abstract fun testNotificationContentButtonStretchDefaultTitleTextHasAction()

    /**
     * PLASMA-T2246
     */
    abstract fun testNotificationContentNoTitleButtonStretchIconTopPositive()

    /**
     * PLASMA-T2247
     */
    abstract fun testNotificationContentNoTextButtonStretchIconStartNegative()

    /**
     * PLASMA-T2248
     */
    abstract fun testNotificationContentNoTextTitleButtonStretchIconTopWarning()

    /**
     * PLASMA-T2249
     */
    abstract fun testNotificationContentLongTextButtonStretchIconStartInfo()

    /**
     * PLASMA-T2250
     */
    abstract fun testNotificationContentNoButtonStretchIconStartDefault()

    /**
     * PLASMA-T2267
     */
    abstract fun testNotificationContentButtonStretchPositive()

    /**
     * PLASMA-T2268
     */
    abstract fun testNotificationContentButtonStretchWarning()

    fun ComponentScope.notificationContentButtonStretchDefaultTitleTextHasAction(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "Title",
                text = "Text",
                hasActions = true,
            ),
        ).apply {
            id = R.id.notification_content
        }

    fun ComponentScope.notificationContentNoTitleButtonStretchIconTopPositive(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "",
                text = "Text",
                hasActions = true,
            ),
        ).apply {
            id = R.id.notification_content
        }

    fun ComponentScope.notificationContentNoTextButtonStretchIconStartNegative(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "Title",
                text = "",
                hasActions = true,
            ),
        ).apply {
            id = R.id.notification_content
        }

    fun ComponentScope.notificationContentNoTextTitleButtonStretchIconTopWarning(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "",
                text = "",
                hasActions = true,
            ),
        ).apply {
            id = R.id.notification_content
        }

    fun ComponentScope.notificationContentLongTextButtonStretchIconStartInfo(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "This is long text for testing purposes",
                text = "This is long text for testing purposes",
                hasActions = false,
            ),
        ).apply {
            id = R.id.notification_content
        }

    fun ComponentScope.notificationContentNoButtonStretchIconStartDefault(style: Int) =
        notificationContent(
            style = style,
            context = context,
            state = NotificationContentUiState(
                variant = "",
                title = "Title",
                text = "Text",
                hasActions = true,
            ),
        ).apply {
            id = R.id.notification_content
        }
}
