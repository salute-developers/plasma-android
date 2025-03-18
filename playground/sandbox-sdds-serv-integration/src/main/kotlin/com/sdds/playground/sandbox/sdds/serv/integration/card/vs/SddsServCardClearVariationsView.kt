package com.sdds.playground.sandbox.sdds.serv.integration.card.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCardClearVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "ClearL" to s.Serv_Sdds_ComponentOverlays_CardClearL,
            "ClearM" to s.Serv_Sdds_ComponentOverlays_CardClearM,
            "ClearS" to s.Serv_Sdds_ComponentOverlays_CardClearS,
        )
}
