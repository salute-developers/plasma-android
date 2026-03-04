package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cToolBarHorizontalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalL,
            "L.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalLHasShadow,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalM,
            "M.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalMHasShadow,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalS,
            "S.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalSHasShadow,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalXs,
            "Xs.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarHorizontalXsHasShadow,
        )
}
