package com.sdds.playground.sandbox.sdds.serv.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_SwitchL,
            "M" to s.Serv_Sdds_ComponentOverlays_SwitchM,
            "S" to s.Serv_Sdds_ComponentOverlays_SwitchS,
        )
}
