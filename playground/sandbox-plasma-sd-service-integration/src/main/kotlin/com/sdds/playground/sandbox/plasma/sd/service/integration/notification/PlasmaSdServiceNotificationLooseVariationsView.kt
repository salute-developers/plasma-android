package com.sdds.playground.sandbox.plasma.sd.service.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LooseL" to s.Plasma_SdService_ComponentOverlays_NotificationLooseL,
            "LooseM" to s.Plasma_SdService_ComponentOverlays_NotificationLooseM,
            "LooseS" to s.Plasma_SdService_ComponentOverlays_NotificationLooseS,
        )
}
