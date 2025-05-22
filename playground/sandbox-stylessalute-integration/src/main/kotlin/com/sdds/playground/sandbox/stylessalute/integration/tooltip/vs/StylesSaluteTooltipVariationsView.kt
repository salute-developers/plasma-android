package com.sdds.playground.sandbox.stylessalute.integration.tooltip.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteTooltipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Salute_StylesSalute_ComponentOverlays_TooltipM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_TooltipS,
        )
}
