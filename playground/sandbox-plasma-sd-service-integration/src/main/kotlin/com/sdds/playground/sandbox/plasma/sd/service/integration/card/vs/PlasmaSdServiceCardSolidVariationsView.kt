package com.sdds.playground.sandbox.plasma.sd.service.integration.card.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCardSolidVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SolidL" to s.Plasma_SdService_ComponentOverlays_CardSolidL,
            "SolidM" to s.Plasma_SdService_ComponentOverlays_CardSolidM,
            "SolidS" to s.Plasma_SdService_ComponentOverlays_CardSolidS,
        )
}
