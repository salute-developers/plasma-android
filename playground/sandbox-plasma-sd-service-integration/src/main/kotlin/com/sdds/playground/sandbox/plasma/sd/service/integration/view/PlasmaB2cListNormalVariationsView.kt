package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_ListNormalXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_ListNormalL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_ListNormalM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_ListNormalS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_ListNormalXs,
        )
}
