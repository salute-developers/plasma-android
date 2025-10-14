package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServRectSkeletonVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            ".Default" to DsR.style.Serv_Sdds_ComponentOverlays_RectSkeletonDefault,
            ".Lighter" to DsR.style.Serv_Sdds_ComponentOverlays_RectSkeletonLighter,
        )
}
