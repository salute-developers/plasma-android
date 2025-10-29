package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_CodeInputS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_CodeInputM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_CodeInputL,
        )
}
