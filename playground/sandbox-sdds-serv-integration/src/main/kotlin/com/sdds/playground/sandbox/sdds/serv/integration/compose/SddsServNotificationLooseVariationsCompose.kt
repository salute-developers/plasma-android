package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.notification.L
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.notification.S

internal object SddsServNotificationLooseVariationsCompose : ComposeStyleProvider<String, NotificationStyle>() {
    override val variations: Map<String, @Composable () -> NotificationStyle> =
        mapOf(
            "L" to { NotificationLoose.L.style() },
            "M" to { NotificationLoose.M.style() },
            "S" to { NotificationLoose.S.style() },
        )
}
