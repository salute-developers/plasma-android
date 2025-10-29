package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsScrollBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_ScrollBarS,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_ScrollBarM,
        )
}
