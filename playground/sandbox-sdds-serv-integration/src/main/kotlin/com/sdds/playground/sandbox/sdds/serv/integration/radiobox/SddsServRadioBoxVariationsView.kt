package com.sdds.playground.sandbox.sdds.serv.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_RadioBoxL,
            "M" to s.Serv_Sdds_ComponentOverlays_RadioBoxM,
            "S" to s.Serv_Sdds_ComponentOverlays_RadioBoxS,
        )
}
