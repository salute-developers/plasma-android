package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsNotificationCompactVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_NotificationCompactS,
        )
}
