package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cToolBarVerticalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalL,
            "L.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalLHasShadow,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalM,
            "M.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalMHasShadow,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalS,
            "S.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalSHasShadow,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalXs,
            "Xs.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_ToolBarVerticalXsHasShadow,
        )
}
