package com.sdds.playground.sandbox.plasma.sd.service.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoShadow" to s.Plasma_SdService_ComponentOverlays_DrawerNoShadow,
            "HasShadow" to s.Plasma_SdService_ComponentOverlays_DrawerHasShadow,
        )
}
