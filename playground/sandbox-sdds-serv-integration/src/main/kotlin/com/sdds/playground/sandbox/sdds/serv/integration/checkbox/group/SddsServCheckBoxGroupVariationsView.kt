package com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_CheckBoxGroupM,
            "S" to s.Serv_Sdds_ComponentOverlays_CheckBoxGroupS,
        )
}
