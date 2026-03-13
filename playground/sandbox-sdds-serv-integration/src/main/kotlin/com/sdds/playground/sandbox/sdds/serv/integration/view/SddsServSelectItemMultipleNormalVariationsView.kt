package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectItemMultipleNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleNormalXs,
        )
}
