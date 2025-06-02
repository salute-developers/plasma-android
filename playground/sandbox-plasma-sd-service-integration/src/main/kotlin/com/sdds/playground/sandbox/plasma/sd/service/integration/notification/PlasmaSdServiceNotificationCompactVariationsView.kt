package com.sdds.playground.sandbox.plasma.sd.service.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "CompactL" to s.Plasma_SdService_ComponentOverlays_NotificationCompactL,
            "CompactM" to s.Plasma_SdService_ComponentOverlays_NotificationCompactM,
            "CompactS" to s.Plasma_SdService_ComponentOverlays_NotificationCompactS,
        )
}
