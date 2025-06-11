package com.sdds.playground.sandbox.plasma.giga.integration.notification

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.notification.L
import com.sdds.plasma.giga.styles.notification.M
import com.sdds.plasma.giga.styles.notification.NotificationLoose
import com.sdds.plasma.giga.styles.notification.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaNotificationLooseVariationsCompose :
    ComposeStyleProvider<String, NotificationStyle>() {
    override val variations: Map<String, @Composable () -> NotificationStyle> =
        mapOf(
            "L" to { NotificationLoose.L.style() },
            "M" to { NotificationLoose.M.style() },
            "S" to { NotificationLoose.S.style() },
        )
}
