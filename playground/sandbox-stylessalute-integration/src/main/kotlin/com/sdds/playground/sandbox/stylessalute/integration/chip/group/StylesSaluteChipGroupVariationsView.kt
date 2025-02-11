package com.sdds.playground.sandbox.stylessalute.integration.chip.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteChipGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "Wide" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupWide,
            "Dense" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_ChipGroupDense,
        )
}
