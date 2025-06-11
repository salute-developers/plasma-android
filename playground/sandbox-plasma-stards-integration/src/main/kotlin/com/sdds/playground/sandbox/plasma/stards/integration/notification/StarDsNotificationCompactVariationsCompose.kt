package com.sdds.playground.sandbox.plasma.stards.integration.notification

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.notification.L
import com.sdkit.star.designsystem.styles.notification.M
import com.sdkit.star.designsystem.styles.notification.NotificationCompact
import com.sdkit.star.designsystem.styles.notification.S

internal object StarDsNotificationCompactVariationsCompose :
    ComposeStyleProvider<String, NotificationStyle>() {
    override val variations: Map<String, @Composable () -> NotificationStyle> =
        mapOf(
            "L" to { NotificationCompact.L.style() },
            "M" to { NotificationCompact.M.style() },
            "S" to { NotificationCompact.S.style() },
        )
}
