package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServListItemTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemTightXs,
        )
}
