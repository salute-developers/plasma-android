package com.sdds.testing.compose.notificationcontent

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationContentStyle

/**
 * Тест-кейсы для компонента [NotificationContent]
 */

/**
 * PLASMA-T2245
 */
@Composable
fun NotificationContentHasAction(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        style = style,
        title = "Title",
        text = "Text",
        buttons = {
            button { Button("Label", {}) }
            button { Button("Label", {}) }
        },
    )
}

/**
 * PLASMA-T2246
 */
@Composable
fun NotificationContentNoTitle(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        style = style,
        title = "",
        text = "Text",
        buttons = {
            button { Button("Label", {}) }
            button { Button("Label", {}) }
        },
    )
}

/**
 * PLASMA-T2247
 */
@Composable
fun NotificationContentNoText(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        style = style,
        title = "Title",
        text = "",
        buttons = {
            button { Button("Label", {}) }
            button { Button("Label", {}) }
        },
    )
}

/**
 * PLASMA-T2248
 */
@Composable
fun NotificationContentNoTitleNoText(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        style = style,
        title = "",
        text = "",
        buttons = {
            button { Button("Label", {}) }
            button { Button("Label", {}) }
        },
    )
}

/**
 * PLASMA-T2249
 */
@Composable
fun NotificationContentLongText(style: NotificationContentStyle) {
    NotificationContent(
        modifier = Modifier.fillMaxWidth(fraction = 0.6f),
        style = style,
        title = "This is a long title for testing purposes",
        text = "This is a long text for testing purposes",
        buttons = {},
    )
}
