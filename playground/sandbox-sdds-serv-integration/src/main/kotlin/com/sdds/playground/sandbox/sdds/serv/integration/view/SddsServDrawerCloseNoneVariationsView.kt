package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDrawerCloseNoneVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DrawerCloseNoneM,
            "M.HasShadow" to DsR.style.Serv_Sdds_ComponentOverlays_DrawerCloseNoneMHasShadow,
        )
}
