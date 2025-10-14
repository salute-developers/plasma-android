package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServTabsDefaultVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultL,
            "L.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultLVertical,
            "L.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultLHorizontal,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultM,
            "M.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultMVertical,
            "M.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultMHorizontal,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultS,
            "S.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultSVertical,
            "S.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultSHorizontal,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultXs,
            "Xs.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultXsVertical,
            "Xs.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabsDefaultXsHorizontal,
        )
}
