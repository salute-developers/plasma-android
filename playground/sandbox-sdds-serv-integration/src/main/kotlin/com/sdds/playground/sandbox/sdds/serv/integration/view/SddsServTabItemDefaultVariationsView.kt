package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServTabItemDefaultVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultL,
            "L.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultLHorizontal,
            "L.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultLVertical,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultM,
            "M.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultMHorizontal,
            "M.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultMVertical,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultS,
            "S.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultSHorizontal,
            "S.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultSVertical,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultXs,
            "Xs.Horizontal" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultXsHorizontal,
            "Xs.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_TabItemDefaultXsVertical,
        )
}
