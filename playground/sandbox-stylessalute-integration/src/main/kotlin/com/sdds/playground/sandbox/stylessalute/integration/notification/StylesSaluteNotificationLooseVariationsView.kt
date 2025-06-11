package com.sdds.playground.sandbox.stylessalute.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LooseL" to s.Salute_StylesSalute_ComponentOverlays_NotificationLooseL,
            "LooseM" to s.Salute_StylesSalute_ComponentOverlays_NotificationLooseM,
            "LooseS" to s.Salute_StylesSalute_ComponentOverlays_NotificationLooseS,
        )
}
