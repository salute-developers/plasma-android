package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cListItemTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_ListItemTightXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_ListItemTightL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_ListItemTightM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_ListItemTightS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_ListItemTightXs,
        )
}
