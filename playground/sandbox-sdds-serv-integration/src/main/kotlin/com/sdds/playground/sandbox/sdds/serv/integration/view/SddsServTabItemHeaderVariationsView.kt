package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServTabItemHeaderVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemHeaderH1,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemHeaderH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemHeaderH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemHeaderH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemHeaderH5,
        )
}
