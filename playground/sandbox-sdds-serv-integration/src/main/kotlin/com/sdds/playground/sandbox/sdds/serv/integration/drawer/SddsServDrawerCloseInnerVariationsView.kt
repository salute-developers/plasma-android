package com.sdds.playground.sandbox.sdds.serv.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServDrawerCloseInnerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_DrawerCloseInnerM,
            "M.HasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerCloseInnerMHasShadow,
        )
}
