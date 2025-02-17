package com.sdds.playground.sandbox.sdds.serv.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Wide" to s.Serv_Sdds_ComponentOverlays_ChipGroupWide,
            "Dense" to s.Serv_Sdds_ComponentOverlays_ChipGroupDense,
        )
}
