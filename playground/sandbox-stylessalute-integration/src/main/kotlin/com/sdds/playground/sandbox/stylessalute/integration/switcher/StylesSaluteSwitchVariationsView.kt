package com.sdds.playground.sandbox.stylessalute.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "L" to s.Salute_StylesSalute_ComponentOverlays_SwitchL,
        "M" to s.Salute_StylesSalute_ComponentOverlays_SwitchM,
        "S" to s.Salute_StylesSalute_ComponentOverlays_SwitchS,
    )
}
