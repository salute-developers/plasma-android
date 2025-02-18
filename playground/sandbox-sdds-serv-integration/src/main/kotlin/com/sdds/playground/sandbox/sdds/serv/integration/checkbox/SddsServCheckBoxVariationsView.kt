package com.sdds.playground.sandbox.sdds.serv.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Serv_Sdds_ComponentOverlays_CheckBoxM,
            "S" to s.Serv_Sdds_ComponentOverlays_CheckBoxS,
        )
}
