// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.notification.L
import com.sdkit.star.designsystem.styles.notification.M
import com.sdkit.star.designsystem.styles.notification.NotificationLoose
import com.sdkit.star.designsystem.styles.notification.S

internal object PlasmaStardsNotificationLooseVariationsCompose : ComposeStyleProvider<NotificationStyle>() {
    override val variations: Map<String, ComposeStyleReference<NotificationStyle>> =
        mapOf(
            "L" to ComposeStyleReference { NotificationLoose.L.style() },
            "M" to ComposeStyleReference { NotificationLoose.M.style() },
            "S" to ComposeStyleReference { NotificationLoose.S.style() },
        )
}
