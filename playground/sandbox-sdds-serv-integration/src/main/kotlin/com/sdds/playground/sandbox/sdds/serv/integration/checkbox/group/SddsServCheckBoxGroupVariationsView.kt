package com.sdds.playground.sandbox.sdds.serv.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CheckBoxGroupS,
        )
}
