package com.sdds.playground.sandbox.sdds.serv.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Serv_Sdds_ComponentOverlays_ListTightXl,
            "L" to s.Serv_Sdds_ComponentOverlays_ListTightL,
            "M" to s.Serv_Sdds_ComponentOverlays_ListTightM,
            "S" to s.Serv_Sdds_ComponentOverlays_ListTightS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_ListTightXs,
        )
}
