package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuNormalXs,
        )
}
