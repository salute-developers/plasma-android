package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cNavigationBarInternalPageVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoBackground" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageNoBackground,
            "NoBackground.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageNoBackgroundRounded,
            "HasBackground" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageHasBackground,
            "HasBackground.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageHasBackgroundRounded,
            "HasBackground.Shadow" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadow,
            "HasBackground.Shadow.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadowRounded,
        )
}
