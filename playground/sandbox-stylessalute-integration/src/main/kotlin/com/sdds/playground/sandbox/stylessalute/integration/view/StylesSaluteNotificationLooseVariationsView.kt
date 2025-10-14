package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationLooseL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationLooseM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_NotificationLooseS,
        )
}
