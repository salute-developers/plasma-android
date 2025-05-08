package com.sdds.playground.sandbox.plasma.sd.service.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_SwitchL,
            "LToggleS" to s.Plasma_SdService_ComponentOverlays_SwitchLToggleS,
            "M" to s.Plasma_SdService_ComponentOverlays_SwitchM,
            "MToggleS" to s.Plasma_SdService_ComponentOverlays_SwitchMToggleS,
            "S" to s.Plasma_SdService_ComponentOverlays_SwitchS,
            "SToggleS" to s.Plasma_SdService_ComponentOverlays_SwitchSToggleS,
        )
}
