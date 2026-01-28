package com.sdds.compose.uikit.fixtures.samples.notification

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Notification
import com.sdds.compose.uikit.NotificationContent
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.overlay.LocalOverlayManager
import com.sdds.compose.uikit.overlay.OverlayPosition
import com.sdds.compose.uikit.overlay.showNotification
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Notification_Simple() {
    composableCodeSnippet {
        val overlayManager = LocalOverlayManager.current
        Button(
            label = "show notification",
            onClick = {
                overlayManager.showNotification(
                    durationMillis = 3000,
                    position = OverlayPosition.BottomEnd,
                    isFocusable = false,
                ) {
                    Notification(
                        hasClose = true,
                        closeIcon = painterResource(com.sdds.icons.R.drawable.ic_close_24),
                        onClose = { overlayManager.remove(it) },
                    ) {
                        NotificationContent(
                            modifier = Modifier.fillMaxWidth(),
                            title = "Title",
                            text = "Notification Text",
                            buttons = {
                                button { Button(label = "Ok", onClick = {}) }
                                button { Button(label = "Cancel", onClick = {}) }
                            },
                        )
                    }
                }
            },
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Notification_Style() {
    composableCodeSnippet {
        NotificationStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(8.dp), "/** Токе формы(скругления) */"))
            .dimensions {
                closeSize(16.0.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.Gray))
                closeColor(Color.LightGray)
            }
            .notificationContentStyle(
                placeholder(
                    NotificationContentStyle.builder().style(),
                    "",
                ),
            )
            .style()
    }
}
