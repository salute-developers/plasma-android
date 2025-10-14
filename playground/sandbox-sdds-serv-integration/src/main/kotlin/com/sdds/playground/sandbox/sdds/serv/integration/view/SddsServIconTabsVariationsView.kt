package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServIconTabsVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsL,
            "L.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsLVertical,
            "L.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsLHorizontal,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsM,
            "M.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsMVertical,
            "M.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsMHorizontal,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsS,
            "S.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsSVertical,
            "S.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsSHorizontal,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsXs,
            "Xs.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsXsVertical,
            "Xs.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_IconTabsXsHorizontal,
        )
}
