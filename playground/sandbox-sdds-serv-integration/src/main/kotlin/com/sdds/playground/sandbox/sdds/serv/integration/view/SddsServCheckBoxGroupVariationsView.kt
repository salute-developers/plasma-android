package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupS,
        )
}
