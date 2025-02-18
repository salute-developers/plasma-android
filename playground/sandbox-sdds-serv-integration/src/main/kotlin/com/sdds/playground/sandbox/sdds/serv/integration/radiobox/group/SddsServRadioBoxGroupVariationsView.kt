package com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_RadioBoxGroupM,
            "S" to s.Serv_Sdds_ComponentOverlays_RadioBoxGroupS,
        )
}
