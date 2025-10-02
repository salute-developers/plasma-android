package com.sdds.playground.sandbox.sdds.serv.integration.tabs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServTabsDefaultVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L.Horizontal" to s.Serv_Sdds_ComponentOverlays_TabsDefaultLHorizontal,
            "L.Vertical" to s.Serv_Sdds_ComponentOverlays_TabsDefaultLVertical,
            "M.Horizontal" to s.Serv_Sdds_ComponentOverlays_TabsDefaultMHorizontal,
            "M.Vertical" to s.Serv_Sdds_ComponentOverlays_TabsDefaultMVertical,
            "S.Horizontal" to s.Serv_Sdds_ComponentOverlays_TabsDefaultSHorizontal,
            "S.Vertical" to s.Serv_Sdds_ComponentOverlays_TabsDefaultSVertical,
            "Xs.Horizontal" to s.Serv_Sdds_ComponentOverlays_TabsDefaultXsHorizontal,
            "Xs.Vertical" to s.Serv_Sdds_ComponentOverlays_TabsDefaultXsVertical,
        )
}
