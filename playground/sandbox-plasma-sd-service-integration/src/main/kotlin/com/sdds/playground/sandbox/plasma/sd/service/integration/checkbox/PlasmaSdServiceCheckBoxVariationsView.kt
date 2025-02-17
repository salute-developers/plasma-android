package com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Plasma_SdService_ComponentOverlays_CheckBoxM,
            "S" to s.Plasma_SdService_ComponentOverlays_CheckBoxS,
        )
}
