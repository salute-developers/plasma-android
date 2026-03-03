package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServToolBarVerticalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalL,
            "L.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalLHasShadow,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalM,
            "M.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalMHasShadow,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalS,
            "S.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalSHasShadow,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalXs,
            "Xs.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_ToolBarVerticalXsHasShadow,
        )
}
