package com.sdds.playground.sandbox.plasma.sd.service.integration.tooltip.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceTooltipVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Plasma_SdService_ComponentOverlays_TooltipM,
            "S" to s.Plasma_SdService_ComponentOverlays_TooltipS,
        )
}
