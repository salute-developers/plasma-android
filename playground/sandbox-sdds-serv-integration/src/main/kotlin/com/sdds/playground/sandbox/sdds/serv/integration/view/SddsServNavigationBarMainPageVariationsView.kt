package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServNavigationBarMainPageVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoBackground" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageNoBackground,
            "NoBackground.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageNoBackgroundRounded,
            "HasBackground" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageHasBackground,
            "HasBackground.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageHasBackgroundRounded,
            "HasBackground.Shadow" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageHasBackgroundShadow,
            "HasBackground.Shadow.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarMainPageHasBackgroundShadowRounded,
        )
}
