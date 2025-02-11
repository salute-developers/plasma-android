package com.sdds.playground.sandbox.stylessalute.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupS,
        )
}
