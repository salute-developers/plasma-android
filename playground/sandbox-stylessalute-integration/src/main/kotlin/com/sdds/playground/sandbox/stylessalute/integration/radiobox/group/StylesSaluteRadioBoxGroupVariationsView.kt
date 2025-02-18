package com.sdds.playground.sandbox.stylessalute.integration.radiobox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteRadioBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to s.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_RadioBoxGroupS,
        )
}
