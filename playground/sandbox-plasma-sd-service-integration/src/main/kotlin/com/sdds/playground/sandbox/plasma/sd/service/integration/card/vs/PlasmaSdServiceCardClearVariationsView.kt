package com.sdds.playground.sandbox.plasma.sd.service.integration.card.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCardClearVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "ClearL" to s.Plasma_SdService_ComponentOverlays_CardClearL,
            "ClearM" to s.Plasma_SdService_ComponentOverlays_CardClearM,
            "ClearS" to s.Plasma_SdService_ComponentOverlays_CardClearS,
        )
}
