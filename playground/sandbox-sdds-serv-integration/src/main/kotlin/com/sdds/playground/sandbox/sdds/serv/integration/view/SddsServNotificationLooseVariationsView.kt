package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_NotificationLooseL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_NotificationLooseM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_NotificationLooseS,
        )
}
