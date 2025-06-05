package com.sdds.playground.sandbox.sdds.serv.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "CompactL" to s.Serv_Sdds_ComponentOverlays_NotificationCompactL,
            "CompactM" to s.Serv_Sdds_ComponentOverlays_NotificationCompactM,
            "CompactS" to s.Serv_Sdds_ComponentOverlays_NotificationCompactS,
        )
}
