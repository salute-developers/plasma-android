package com.sdds.playground.sandbox.stylessalute.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "CompactL" to s.Salute_StylesSalute_ComponentOverlays_NotificationCompactL,
            "CompactM" to s.Salute_StylesSalute_ComponentOverlays_NotificationCompactM,
            "CompactS" to s.Salute_StylesSalute_ComponentOverlays_NotificationCompactS,
        )
}
