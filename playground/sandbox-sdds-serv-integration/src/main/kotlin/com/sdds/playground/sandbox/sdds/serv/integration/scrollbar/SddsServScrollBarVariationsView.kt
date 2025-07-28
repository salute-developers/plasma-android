package com.sdds.playground.sandbox.sdds.serv.integration.scrollbar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServScrollBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_ScrollBarM,
            "S" to s.Serv_Sdds_ComponentOverlays_ScrollBarS,
        )
}
