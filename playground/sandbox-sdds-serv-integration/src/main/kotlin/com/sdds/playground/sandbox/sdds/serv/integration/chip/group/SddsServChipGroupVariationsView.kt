package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object SddsServChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Wide" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipGroupWide,
            "Dense" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_ChipGroupDense,
        )
}
