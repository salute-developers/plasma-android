package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsSelectItemVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectItemL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectItemM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectItemS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_SelectItemXs,
        )
}
