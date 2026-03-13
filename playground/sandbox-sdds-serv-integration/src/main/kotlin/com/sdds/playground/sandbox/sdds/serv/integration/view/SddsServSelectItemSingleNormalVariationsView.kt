package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectItemSingleNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemSingleNormalXs,
        )
}
