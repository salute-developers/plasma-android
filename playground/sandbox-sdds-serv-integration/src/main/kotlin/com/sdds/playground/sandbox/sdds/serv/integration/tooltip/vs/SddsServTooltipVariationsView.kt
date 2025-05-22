package com.sdds.playground.sandbox.sdds.serv.integration.tooltip.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServTooltipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_TooltipM,
            "S" to s.Serv_Sdds_ComponentOverlays_TooltipS,
        )
}
