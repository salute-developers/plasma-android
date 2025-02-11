package com.sdds.playground.sandbox.stylessalute.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_RadioBoxS,
        )
}
