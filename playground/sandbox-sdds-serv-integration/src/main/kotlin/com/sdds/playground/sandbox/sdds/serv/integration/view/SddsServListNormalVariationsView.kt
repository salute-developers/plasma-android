package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_ListNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ListNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ListNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ListNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ListNormalXs,
        )
}
