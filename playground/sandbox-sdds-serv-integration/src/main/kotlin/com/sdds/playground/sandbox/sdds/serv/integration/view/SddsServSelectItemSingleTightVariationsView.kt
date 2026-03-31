package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectItemSingleTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleTightXs,
        )
}
