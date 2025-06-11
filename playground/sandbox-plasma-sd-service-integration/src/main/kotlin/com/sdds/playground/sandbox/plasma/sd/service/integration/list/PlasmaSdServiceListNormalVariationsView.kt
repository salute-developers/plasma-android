package com.sdds.playground.sandbox.plasma.sd.service.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Plasma_SdService_ComponentOverlays_ListNormalXl,
            "L" to s.Plasma_SdService_ComponentOverlays_ListNormalL,
            "M" to s.Plasma_SdService_ComponentOverlays_ListNormalM,
            "S" to s.Plasma_SdService_ComponentOverlays_ListNormalS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_ListNormalXs,
        )
}
