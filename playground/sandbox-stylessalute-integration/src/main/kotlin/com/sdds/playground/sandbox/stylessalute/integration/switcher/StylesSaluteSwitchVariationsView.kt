package com.sdds.playground.sandbox.stylessalute.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SwitchL,
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SwitchM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_SwitchS,
        )
}
