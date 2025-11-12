package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToolbarVerticalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalL,
            "L.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalLHasShadow,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalM,
            "M.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalMHasShadow,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalS,
            "S.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalSHasShadow,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalXs,
            "Xs.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolbarVerticalXsHasShadow,
        )
}
