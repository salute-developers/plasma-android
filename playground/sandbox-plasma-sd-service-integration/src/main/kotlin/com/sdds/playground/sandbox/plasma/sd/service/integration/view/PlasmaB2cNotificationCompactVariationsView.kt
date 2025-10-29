package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_NotificationCompactL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_NotificationCompactM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_NotificationCompactS,
        )
}
