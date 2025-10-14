package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsDropdownMenuListVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuListXl,
            "L" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuListL,
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuListM,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuListS,
            "Xs" to DsR.style.Sdkit_StarDs_ComponentOverlays_DropdownMenuListXs,
        )
}
