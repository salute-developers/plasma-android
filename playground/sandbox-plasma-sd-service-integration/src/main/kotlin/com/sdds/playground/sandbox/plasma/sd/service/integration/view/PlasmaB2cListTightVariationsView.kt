package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_ListTightXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_ListTightL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_ListTightM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_ListTightS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_ListTightXs,
        )
}
