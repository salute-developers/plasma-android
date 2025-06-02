package com.sdds.playground.sandbox.plasma.giga.integration.notification

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.notification.L
import com.sdds.plasma.giga.styles.notification.M
import com.sdds.plasma.giga.styles.notification.NotificationCompact
import com.sdds.plasma.giga.styles.notification.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaNotificationCompactVariationsCompose :
    ComposeStyleProvider<String, NotificationStyle>() {
    override val variations: Map<String, @Composable () -> NotificationStyle> =
        mapOf(
            "L" to { NotificationCompact.L.style() },
            "M" to { NotificationCompact.M.style() },
            "S" to { NotificationCompact.S.style() },
        )
}
