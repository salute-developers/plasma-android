package com.sdds.playground.sandbox.sdds.serv.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LooseL" to s.Serv_Sdds_ComponentOverlays_NotificationLooseL,
            "LooseM" to s.Serv_Sdds_ComponentOverlays_NotificationLooseM,
            "LooseS" to s.Serv_Sdds_ComponentOverlays_NotificationLooseS,
        )
}
