package com.sdds.playground.sandbox.sdds.serv.integration.drawer

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServDrawerVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "NoShadow" to s.Serv_Sdds_ComponentOverlays_DrawerNoShadow,
            "HasShadow" to s.Serv_Sdds_ComponentOverlays_DrawerHasShadow,
        )
}
