package com.sdds.playground.sandbox.sdds.serv.integration.codeinput

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SDefault" to s.Serv_Sdds_ComponentOverlays_CodeInputS,
            "MDefault" to s.Serv_Sdds_ComponentOverlays_CodeInputM,
            "LDefault" to s.Serv_Sdds_ComponentOverlays_CodeInputL,
        )
}
