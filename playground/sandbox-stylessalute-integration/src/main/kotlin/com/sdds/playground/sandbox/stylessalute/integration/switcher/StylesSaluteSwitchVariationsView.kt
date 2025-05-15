package com.sdds.playground.sandbox.stylessalute.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "L" to s.Salute_StylesSalute_ComponentOverlays_SwitchL,
        "LToggleS" to s.Salute_StylesSalute_ComponentOverlays_SwitchLToggleS,
        "M" to s.Salute_StylesSalute_ComponentOverlays_SwitchM,
        "MToggleS" to s.Salute_StylesSalute_ComponentOverlays_SwitchMToggleS,
        "S" to s.Salute_StylesSalute_ComponentOverlays_SwitchS,
        "SToggleS" to s.Salute_StylesSalute_ComponentOverlays_SwitchSToggleS,
    )
}
