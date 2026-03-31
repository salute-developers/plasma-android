package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectMultipleNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleNormalXs,
        )
}
