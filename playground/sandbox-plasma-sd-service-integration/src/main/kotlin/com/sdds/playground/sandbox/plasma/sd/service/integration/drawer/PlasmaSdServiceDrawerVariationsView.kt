package com.sdds.playground.sandbox.plasma.sd.service.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MCloseInner" to s.Plasma_SdService_ComponentOverlays_DrawerCloseInnerM,
            "MCloseOuter" to s.Plasma_SdService_ComponentOverlays_DrawerCloseOuterM,
            "MCloseNone" to s.Plasma_SdService_ComponentOverlays_DrawerCloseNoneM,
            "MCloseInnerHasShadow" to s.Plasma_SdService_ComponentOverlays_DrawerCloseInnerMHasShadow,
            "MCloseOuterHasShadow" to s.Plasma_SdService_ComponentOverlays_DrawerCloseOuterMHasShadow,
            "MCloseNoneHasShadow" to s.Plasma_SdService_ComponentOverlays_DrawerCloseNoneMHasShadow,
        )
}
