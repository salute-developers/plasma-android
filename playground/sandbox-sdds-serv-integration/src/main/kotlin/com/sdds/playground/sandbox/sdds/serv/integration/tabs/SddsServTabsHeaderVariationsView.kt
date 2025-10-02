package com.sdds.playground.sandbox.sdds.serv.integration.tabs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServTabsHeaderVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1" to s.Serv_Sdds_ComponentOverlays_TabsHeaderH1,
            "H2" to s.Serv_Sdds_ComponentOverlays_TabsHeaderH2,
            "H3" to s.Serv_Sdds_ComponentOverlays_TabsHeaderH3,
            "H4" to s.Serv_Sdds_ComponentOverlays_TabsHeaderH4,
            "H5" to s.Serv_Sdds_ComponentOverlays_TabsHeaderH5,
        )
}
