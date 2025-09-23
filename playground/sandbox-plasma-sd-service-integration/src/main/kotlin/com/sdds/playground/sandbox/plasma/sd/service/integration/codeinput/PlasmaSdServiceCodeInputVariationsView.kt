package com.sdds.playground.sandbox.plasma.sd.service.integration.codeinput

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SDefault" to s.Plasma_SdService_ComponentOverlays_CodeInputS,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_CodeInputM,
            "LDefault" to s.Plasma_SdService_ComponentOverlays_CodeInputL,
        )
}
