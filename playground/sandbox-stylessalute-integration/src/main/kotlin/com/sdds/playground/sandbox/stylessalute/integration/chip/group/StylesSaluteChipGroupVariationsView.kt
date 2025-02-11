package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "Wide" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupWide,
        "Dense" to s.Salute_StylesSalute_ComponentOverlays_ChipGroupDense,
    )
}
