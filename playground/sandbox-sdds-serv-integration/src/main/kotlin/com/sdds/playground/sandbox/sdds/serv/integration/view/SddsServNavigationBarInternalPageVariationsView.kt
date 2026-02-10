package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServNavigationBarInternalPageVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoBackground" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageNoBackground,
            "NoBackground.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageNoBackgroundRounded,
            "HasBackground" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackground,
            "HasBackground.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundRounded,
            "HasBackground.Shadow" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadow,
            "HasBackground.Shadow.Rounded" to DsR.style.Serv_Sdds_ComponentOverlays_NavigationBarInternalPageHasBackgroundShadowRounded,
        )
}
