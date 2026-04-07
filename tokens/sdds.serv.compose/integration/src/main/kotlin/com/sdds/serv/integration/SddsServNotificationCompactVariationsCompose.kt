// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.notification.L
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationCompact
import com.sdds.serv.styles.notification.S

internal object SddsServNotificationCompactVariationsCompose : ComposeStyleProvider<NotificationStyle>() {
    override val variations: Map<String, ComposeStyleReference<NotificationStyle>> =
        mapOf(
            "L" to ComposeStyleReference { NotificationCompact.L.style() },
            "M" to ComposeStyleReference { NotificationCompact.M.style() },
            "S" to ComposeStyleReference { NotificationCompact.S.style() },
        )
}
