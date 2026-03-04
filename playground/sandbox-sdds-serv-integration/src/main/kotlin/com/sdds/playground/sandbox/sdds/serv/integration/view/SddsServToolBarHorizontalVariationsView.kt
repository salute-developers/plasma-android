package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToolBarHorizontalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalL,
            "L.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalLHasShadow,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalM,
            "M.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalMHasShadow,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalS,
            "S.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalSHasShadow,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalXs,
            "Xs.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarHorizontalXsHasShadow,
        )
}
