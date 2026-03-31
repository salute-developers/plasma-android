package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectSingleNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectSingleNormalXs,
        )
}
