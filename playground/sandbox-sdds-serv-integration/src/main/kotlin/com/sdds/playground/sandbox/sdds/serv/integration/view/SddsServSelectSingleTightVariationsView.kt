package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectSingleTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleTightXs,
        )
}
