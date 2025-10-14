package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsPopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverM,
            "M.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverMDefault,
            "M.Accent" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverMAccent,
            "S" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverS,
            "S.Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverSDefault,
            "S.Accent" to DsR.style.Sdkit_StarDs_ComponentOverlays_PopoverSAccent,
        )
}
