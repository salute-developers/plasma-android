package com.sdds.playground.sandbox.plasma.stards.integration.tooltip.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsTooltipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_TooltipM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_TooltipS,
        )
}
