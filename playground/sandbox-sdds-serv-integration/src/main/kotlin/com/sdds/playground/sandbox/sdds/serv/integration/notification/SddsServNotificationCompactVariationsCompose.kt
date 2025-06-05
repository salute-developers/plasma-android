package com.sdds.playground.sandbox.sdds.serv.integration.notification

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.notification.L
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationCompact
import com.sdds.serv.styles.notification.S

internal object SddsServNotificationCompactVariationsCompose :
    ComposeStyleProvider<String, NotificationStyle>() {
    override val variations: Map<String, @Composable () -> NotificationStyle> =
        mapOf(
            "L" to { NotificationCompact.L.style() },
            "M" to { NotificationCompact.M.style() },
            "S" to { NotificationCompact.S.style() },
        )
}
