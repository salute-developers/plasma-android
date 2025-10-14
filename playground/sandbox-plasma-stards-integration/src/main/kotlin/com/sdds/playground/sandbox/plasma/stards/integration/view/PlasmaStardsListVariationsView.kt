package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsListVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_ListL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_ListM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_ListS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_ListXs,
        )
}
