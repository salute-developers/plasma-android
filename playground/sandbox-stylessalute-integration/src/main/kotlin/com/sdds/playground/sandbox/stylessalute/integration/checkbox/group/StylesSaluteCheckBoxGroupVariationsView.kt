package com.sdds.playground.sandbox.stylessalute.integration.checkbox.group

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteCheckBoxGroupVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "M" to s.Salute_StylesSalute_ComponentOverlays_CheckBoxGroupM,
        "S" to s.Salute_StylesSalute_ComponentOverlays_CheckBoxGroupS,
    )
}
