package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectItemMultipleTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectItemMultipleTightXs,
        )
}
