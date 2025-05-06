package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_RadioBoxL,
            "M" to s.Plasma_SdService_ComponentOverlays_RadioBoxM,
            "S" to s.Plasma_SdService_ComponentOverlays_RadioBoxS,
        )
}
