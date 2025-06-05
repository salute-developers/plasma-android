package com.sdds.playground.sandbox.plasma.stards.integration.notification

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsNotificationLooseVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LooseL" to s.Sdkit_StarDs_ComponentOverlays_NotificationLooseL,
            "LooseM" to s.Sdkit_StarDs_ComponentOverlays_NotificationLooseM,
            "LooseS" to s.Sdkit_StarDs_ComponentOverlays_NotificationLooseS,
        )
}
