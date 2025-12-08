package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cCarouselVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "ButtonsPlacementInner" to DsR.style.Plasma_SdService_ComponentOverlays_CarouselButtonsPlacementInner,
            "ButtonsPlacementOuter" to DsR.style.Plasma_SdService_ComponentOverlays_CarouselButtonsPlacementOuter,
        )
}
