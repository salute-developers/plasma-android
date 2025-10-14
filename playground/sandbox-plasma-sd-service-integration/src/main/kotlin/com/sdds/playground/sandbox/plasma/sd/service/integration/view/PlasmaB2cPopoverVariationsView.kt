package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cPopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverM,
            "M.Default" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverMDefault,
            "M.Accent" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverMAccent,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverS,
            "S.Default" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverSDefault,
            "S.Accent" to DsR.style.Plasma_SdService_ComponentOverlays_PopoverSAccent,
        )
}
