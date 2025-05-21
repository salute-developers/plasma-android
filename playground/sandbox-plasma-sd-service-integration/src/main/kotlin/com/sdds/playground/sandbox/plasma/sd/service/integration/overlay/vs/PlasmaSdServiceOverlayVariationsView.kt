package com.sdds.playground.sandbox.plasma.sd.service.integration.overlay.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceOverlayVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Default" to s.Plasma_SdService_ComponentOverlays_OverlayView,
        )
}
