package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationCompactL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationCompactM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationCompactS,
        )
}
