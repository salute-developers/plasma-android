// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.notification.L
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.notification.NotificationLooseSize
import com.sdds.serv.styles.notification.NotificationStyles
import com.sdds.serv.styles.notification.S
import com.sdds.serv.styles.notification.resolve

internal object SddsServNotificationLooseVariationsCompose : ComposeStyleProvider<NotificationStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<NotificationStyle>> =
        mapOf(
            "NotificationLoose.L" to ComposeStyleReference { NotificationLoose.L.style() },
            "NotificationLoose.M" to ComposeStyleReference { NotificationLoose.M.style() },
            "NotificationLoose.S" to ComposeStyleReference { NotificationLoose.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NotificationStyles.Loose.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> NotificationLooseSize.L
                "M" -> NotificationLooseSize.M
                "S" -> NotificationLooseSize.S
                else -> NotificationLooseSize.L
            },
        ).key
    }
}
