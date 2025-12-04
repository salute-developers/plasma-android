package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAutocompleteNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteNormalXs,
        )
}
