package com.sdds.playground.sandbox.sdds.serv.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Serv_Sdds_ComponentOverlays_ListNormalXl,
            "L" to s.Serv_Sdds_ComponentOverlays_ListNormalL,
            "M" to s.Serv_Sdds_ComponentOverlays_ListNormalM,
            "S" to s.Serv_Sdds_ComponentOverlays_ListNormalS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_ListNormalXs,
        )
}
