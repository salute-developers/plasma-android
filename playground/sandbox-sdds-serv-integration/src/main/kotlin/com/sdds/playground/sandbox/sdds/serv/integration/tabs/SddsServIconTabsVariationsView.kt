package com.sdds.playground.sandbox.sdds.serv.integration.tabs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServIconTabsVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L.Horizontal" to s.Serv_Sdds_ComponentOverlays_IconTabsLHorizontal,
            "L.Vertical" to s.Serv_Sdds_ComponentOverlays_IconTabsLVertical,
            "M.Horizontal" to s.Serv_Sdds_ComponentOverlays_IconTabsMHorizontal,
            "M.Vertical" to s.Serv_Sdds_ComponentOverlays_IconTabsMVertical,
            "S.Horizontal" to s.Serv_Sdds_ComponentOverlays_IconTabsSHorizontal,
            "S.Vertical" to s.Serv_Sdds_ComponentOverlays_IconTabsSVertical,
            "Xs.Horizontal" to s.Serv_Sdds_ComponentOverlays_IconTabsXsHorizontal,
            "Xs.Vertical" to s.Serv_Sdds_ComponentOverlays_IconTabsXsVertical,
        )
}
