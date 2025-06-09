package com.sdds.playground.sandbox.plasma.sd.service.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Plasma_SdService_ComponentOverlays_ListTightXl,
            "L" to s.Plasma_SdService_ComponentOverlays_ListTightL,
            "M" to s.Plasma_SdService_ComponentOverlays_ListTightM,
            "S" to s.Plasma_SdService_ComponentOverlays_ListTightS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_ListTightXs,
        )
}
