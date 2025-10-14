package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsDropdownMenuVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXl,
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuXs,
        )
}
