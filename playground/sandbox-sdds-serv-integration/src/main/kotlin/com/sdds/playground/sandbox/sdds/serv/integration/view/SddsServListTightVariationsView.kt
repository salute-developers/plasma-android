package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_ListTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ListTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ListTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ListTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ListTightXs,
        )
}
