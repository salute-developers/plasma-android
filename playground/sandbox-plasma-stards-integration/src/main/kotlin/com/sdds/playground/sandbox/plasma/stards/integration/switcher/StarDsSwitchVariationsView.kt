package com.sdds.playground.sandbox.plasma.stards.integration.switcher

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_SwitchL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_SwitchM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_SwitchS,
        )
}
