package com.sdds.playground.sandbox.plasma.sd.service.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_CheckBoxGroupL,
            "M" to s.Plasma_SdService_ComponentOverlays_CheckBoxGroupM,
            "S" to s.Plasma_SdService_ComponentOverlays_CheckBoxGroupS,
        )
}
