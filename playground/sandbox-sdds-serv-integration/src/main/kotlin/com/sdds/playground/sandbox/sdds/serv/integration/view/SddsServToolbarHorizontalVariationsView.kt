package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToolbarHorizontalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalL,
            "L.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalLHasShadow,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalM,
            "M.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalMHasShadow,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalS,
            "S.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalSHasShadow,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalXs,
            "Xs.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarHorizontalXsHasShadow,
        )
}
