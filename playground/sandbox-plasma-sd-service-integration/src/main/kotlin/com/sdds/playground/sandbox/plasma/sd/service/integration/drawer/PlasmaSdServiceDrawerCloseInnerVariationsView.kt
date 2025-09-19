package com.sdds.playground.sandbox.plasma.sd.service.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceDrawerCloseInnerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Plasma_SdService_ComponentOverlays_DrawerCloseInnerM,
            "M.HasShadow" to s.Plasma_SdService_ComponentOverlays_DrawerCloseInnerMHasShadow,
        )
}
