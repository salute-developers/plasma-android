package com.sdds.playground.sandbox.plasma.sd.service.integration.scrollbar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceScrollBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Plasma_SdService_ComponentOverlays_ScrollBarM,
            "S" to s.Plasma_SdService_ComponentOverlays_ScrollBarS,
        )
}
