package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cDropdownMenuListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListTightXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListTightL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListTightM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListTightS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_DropdownMenuListTightXs,
        )
}
