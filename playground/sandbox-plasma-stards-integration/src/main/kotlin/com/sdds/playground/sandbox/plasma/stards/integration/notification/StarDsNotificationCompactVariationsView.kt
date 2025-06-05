package com.sdds.playground.sandbox.plasma.stards.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "CompactL" to s.Sdkit_StarDs_ComponentOverlays_NotificationCompactL,
            "CompactM" to s.Sdkit_StarDs_ComponentOverlays_NotificationCompactM,
            "CompactS" to s.Sdkit_StarDs_ComponentOverlays_NotificationCompactS,
        )
}
