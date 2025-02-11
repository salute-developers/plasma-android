package com.sdds.playground.sandbox.sdds.serv.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CheckBoxM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CheckBoxS,
        )
}
