package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCarouselVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "ButtonsPlacementInner" to DsR.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementInner,
            "ButtonsPlacementOuter" to DsR.style.Serv_Sdds_ComponentOverlays_CarouselButtonsPlacementOuter,
        )
}
