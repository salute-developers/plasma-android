// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.notification.L
import com.sdds.plasma.sd.service.styles.notification.M
import com.sdds.plasma.sd.service.styles.notification.NotificationCompact
import com.sdds.plasma.sd.service.styles.notification.S

internal object PlasmaB2cNotificationCompactVariationsCompose : ComposeStyleProvider<NotificationStyle>() {
    override val variations: Map<String, ComposeStyleReference<NotificationStyle>> =
        mapOf(
            "L" to ComposeStyleReference { NotificationCompact.L.style() },
            "M" to ComposeStyleReference { NotificationCompact.M.style() },
            "S" to ComposeStyleReference { NotificationCompact.S.style() },
        )
}
