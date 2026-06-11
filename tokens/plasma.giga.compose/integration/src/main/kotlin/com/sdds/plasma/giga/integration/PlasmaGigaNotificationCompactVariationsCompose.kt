// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.notification.L
import com.sdds.plasma.giga.styles.notification.M
import com.sdds.plasma.giga.styles.notification.NotificationCompact
import com.sdds.plasma.giga.styles.notification.NotificationCompactSize
import com.sdds.plasma.giga.styles.notification.NotificationStyles
import com.sdds.plasma.giga.styles.notification.S
import com.sdds.plasma.giga.styles.notification.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaNotificationCompactVariationsCompose : ComposeStyleProvider<NotificationStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<NotificationStyle>> =
        mapOf(
            "NotificationCompact.L" to ComposeStyleReference { NotificationCompact.L.style() },
            "NotificationCompact.M" to ComposeStyleReference { NotificationCompact.M.style() },
            "NotificationCompact.S" to ComposeStyleReference { NotificationCompact.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NotificationStyles.Compact.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> NotificationCompactSize.L
                "M" -> NotificationCompactSize.M
                "S" -> NotificationCompactSize.S
                else -> NotificationCompactSize.L
            },
        ).key
    }
}
