package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToolbarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarL,
            "L.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarLVertical,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarM,
            "M.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarMVertical,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarS,
            "S.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarSVertical,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarXs,
            "Xs.Vertical" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarXsVertical,
        )
}
