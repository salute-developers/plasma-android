package com.sdds.playground.sandbox.plasma.sd.service.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Wide" to s.Plasma_SdService_ComponentOverlays_ChipGroupWide,
            "Dense" to s.Plasma_SdService_ComponentOverlays_ChipGroupDense,
        )
}
