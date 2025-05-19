package com.sdds.playground.sandbox.plasma.sd.service.integration.popover.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServicePopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MDefault" to s.Plasma_SdService_ComponentOverlays_PopoverMDefault,
            "MAccent" to s.Plasma_SdService_ComponentOverlays_PopoverMAccent,
            "SDefault" to s.Plasma_SdService_ComponentOverlays_PopoverSDefault,
            "SAccent" to s.Plasma_SdService_ComponentOverlays_PopoverSAccent,
        )
}
