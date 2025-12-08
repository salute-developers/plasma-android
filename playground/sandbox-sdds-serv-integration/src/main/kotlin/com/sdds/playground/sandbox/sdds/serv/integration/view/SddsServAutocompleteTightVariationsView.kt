package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAutocompleteTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AutocompleteTightXs,
        )
}
