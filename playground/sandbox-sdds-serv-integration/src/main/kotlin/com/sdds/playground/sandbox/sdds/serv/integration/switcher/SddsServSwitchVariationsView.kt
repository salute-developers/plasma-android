package com.sdds.playground.sandbox.sdds.serv.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SwitchL,
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SwitchM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_SwitchS,
        )
}
