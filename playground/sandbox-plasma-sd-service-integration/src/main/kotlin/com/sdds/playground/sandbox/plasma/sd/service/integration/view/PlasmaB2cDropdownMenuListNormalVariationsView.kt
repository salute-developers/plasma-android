package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cDropdownMenuListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListNormalXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListNormalL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListNormalM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListNormalS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListNormalXs,
        )
}
