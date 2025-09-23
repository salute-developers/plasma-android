package com.sdds.playground.sandbox.plasma.sd.service.integration.codefield

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCodeFieldVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "LDefault" to s.Plasma_SdService_ComponentOverlays_CodeFieldL,
            "MDefault" to s.Plasma_SdService_ComponentOverlays_CodeFieldM,
            "LSegmented" to s.Plasma_SdService_ComponentOverlays_CodeFieldLSegmented,
            "MSegmented" to s.Plasma_SdService_ComponentOverlays_CodeFieldMSegmented,
        )
}
