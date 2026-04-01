package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSelectMultipleTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_SelectMultipleTightXs,
        )
}
