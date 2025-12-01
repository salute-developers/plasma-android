package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAutocompleteTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteTightXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteTightL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteTightM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteTightS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteTightXs,
        )
}
