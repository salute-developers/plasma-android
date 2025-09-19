package com.sdds.playground.sandbox.sdds.serv.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServDrawerCloseOuterVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_DrawerCloseOuterM,
            "M.HasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerCloseOuterMHasShadow,
        )
}
