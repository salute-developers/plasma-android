package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cNavigationBarMainPageVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoBackground" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageNoBackground,
            "NoBackground.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageNoBackgroundRounded,
            "HasBackground" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageHasBackground,
            "HasBackground.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageHasBackgroundRounded,
            "HasBackground.Shadow" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageHasBackgroundShadow,
            "HasBackground.Shadow.Rounded" to DsR.style.Plasma_SdService_ComponentOverlays_NavigationBarMainPageHasBackgroundShadowRounded,
        )
}
