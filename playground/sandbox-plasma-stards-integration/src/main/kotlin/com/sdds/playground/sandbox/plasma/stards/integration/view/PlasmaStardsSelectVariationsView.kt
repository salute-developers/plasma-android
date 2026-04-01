package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsSelectVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectXs,
        )
}
