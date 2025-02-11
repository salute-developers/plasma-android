package com.sdds.playground.sandbox.sdds.serv.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_RadioBoxGroupM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_RadioBoxGroupS,
        )
}
