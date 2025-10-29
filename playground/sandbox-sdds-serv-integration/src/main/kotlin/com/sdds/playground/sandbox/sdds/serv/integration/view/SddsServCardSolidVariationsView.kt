package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCardSolidVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_CardSolidL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_CardSolidM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_CardSolidS,
        )
}
