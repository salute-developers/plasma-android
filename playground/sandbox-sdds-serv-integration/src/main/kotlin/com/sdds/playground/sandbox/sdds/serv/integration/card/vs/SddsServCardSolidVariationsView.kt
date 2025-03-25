package com.sdds.playground.sandbox.sdds.serv.integration.card.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCardSolidVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SolidL" to s.Serv_Sdds_ComponentOverlays_CardSolidL,
            "SolidM" to s.Serv_Sdds_ComponentOverlays_CardSolidM,
            "SolidS" to s.Serv_Sdds_ComponentOverlays_CardSolidS,
        )
}
