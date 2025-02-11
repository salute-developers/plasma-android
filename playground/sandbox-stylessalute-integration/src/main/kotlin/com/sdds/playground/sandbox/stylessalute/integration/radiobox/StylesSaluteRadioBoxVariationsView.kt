package com.sdds.playground.sandbox.stylessalute.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "M" to s.Salute_StylesSalute_ComponentOverlays_RadioBoxM,
        "S" to s.Salute_StylesSalute_ComponentOverlays_RadioBoxS,
    )
}
