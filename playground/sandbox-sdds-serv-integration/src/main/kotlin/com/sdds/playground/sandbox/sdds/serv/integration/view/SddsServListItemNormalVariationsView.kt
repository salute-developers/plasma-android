package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServListItemNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ListItemNormalXs,
        )
}
