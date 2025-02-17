package com.sdds.playground.sandbox.plasma.sd.service.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_SwitchL,
            "M" to s.Plasma_SdService_ComponentOverlays_SwitchM,
            "S" to s.Plasma_SdService_ComponentOverlays_SwitchS,
        )
}
