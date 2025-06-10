package com.sdds.testing.compose.notification

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.icons.R

/**
 * Тест кейсы для Notification
 */

/**
 * Preview для меню песочницы
 */
@Composable
fun NotificationForSandbox(style: NotificationStyle) {
    val overlayManager = LocalOverlayManager.current
    Button(
        label = "Show Notification",
        onClick = {
            overlayManager.showNotification(
                durationMillis = 3000,
                position = OverlayPosition.CenterStart,
                isFocusable = true,
            ) {
                Notification(
                    style = style,
                    hasClose = true,
                    closeIcon = painterResource(R.drawable.ic_close_24),
                    onClose = { overlayManager.remove(it) },
                ) {
                    val idText = "$it"
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(end = 32.dp),
                    ) {
                        Text(text = "Notification $idText")
                        Spacer(Modifier.size(8.dp))
                        Button(
                            label = "Action",
                            onClick = {},
                        )
                    }
                }
            }
        },
    )
}
