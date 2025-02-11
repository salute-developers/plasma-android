package com.sdds.playground.sandbox.stylessalute.integration.checkbox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "M" to s.Salute_StylesSalute_ComponentOverlays_CheckBoxM,
        "S" to s.Salute_StylesSalute_ComponentOverlays_CheckBoxS,
    )
}
