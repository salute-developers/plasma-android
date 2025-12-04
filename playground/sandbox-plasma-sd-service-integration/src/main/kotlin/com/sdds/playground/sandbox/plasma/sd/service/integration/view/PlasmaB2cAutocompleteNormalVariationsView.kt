package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAutocompleteNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteNormalXl,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteNormalL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteNormalM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteNormalS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AutocompleteNormalXs,
        )
}
