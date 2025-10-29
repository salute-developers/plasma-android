package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cDrawerCloseOuterVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_DrawerCloseOuterM,
            "M.HasShadow" to DsR.style.Plasma_SdService_ComponentOverlays_DrawerCloseOuterMHasShadow,
        )
}
