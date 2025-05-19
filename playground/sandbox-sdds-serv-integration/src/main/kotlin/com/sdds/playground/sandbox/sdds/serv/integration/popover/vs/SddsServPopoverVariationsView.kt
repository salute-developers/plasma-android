package com.sdds.playground.sandbox.sdds.serv.integration.popover.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServPopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MDefault" to s.Serv_Sdds_ComponentOverlays_PopoverMDefault,
            "MAccent" to s.Serv_Sdds_ComponentOverlays_PopoverMAccent,
            "SDefault" to s.Serv_Sdds_ComponentOverlays_PopoverSDefault,
            "SAccent" to s.Serv_Sdds_ComponentOverlays_PopoverSAccent,
        )
}
