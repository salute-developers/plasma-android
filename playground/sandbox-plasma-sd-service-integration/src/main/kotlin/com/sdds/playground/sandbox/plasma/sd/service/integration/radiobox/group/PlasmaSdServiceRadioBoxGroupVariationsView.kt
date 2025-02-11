package com.sdds.playground.sandbox.plasma.sd.service.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Plasma_SdService_ComponentOverlays_RadioBoxGroupM,
            "S" to s.Plasma_SdService_ComponentOverlays_RadioBoxGroupS,
        )
}
