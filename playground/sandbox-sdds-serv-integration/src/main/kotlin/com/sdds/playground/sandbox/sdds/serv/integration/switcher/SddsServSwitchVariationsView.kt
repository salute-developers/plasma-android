package com.sdds.playground.sandbox.sdds.serv.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_SwitchL,
            "LToggleS" to s.Serv_Sdds_ComponentOverlays_SwitchLToggleS,
            "M" to s.Serv_Sdds_ComponentOverlays_SwitchM,
            "MToggleS" to s.Serv_Sdds_ComponentOverlays_SwitchMToggleS,
            "S" to s.Serv_Sdds_ComponentOverlays_SwitchS,
            "SToggleS" to s.Serv_Sdds_ComponentOverlays_SwitchSToggleS,
        )
}
