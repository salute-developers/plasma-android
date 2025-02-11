package com.sdds.playground.sandbox.sdds.serv.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_RadioBoxM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_RadioBoxS,
        )
}
