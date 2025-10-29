package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "HasBackground" to DsR.style.Sdkit_StarDs_ComponentOverlays_DrawerHasBackground,
            "NoBackground" to DsR.style.Sdkit_StarDs_ComponentOverlays_DrawerNoBackground,
        )
}
