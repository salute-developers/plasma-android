package com.sdds.playground.sandbox.plasma.stards.integration.popover.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsPopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MDefault" to s.Sdkit_StarDs_ComponentOverlays_PopoverMDefault,
            "MAccent" to s.Sdkit_StarDs_ComponentOverlays_PopoverMAccent,
            "SDefault" to s.Sdkit_StarDs_ComponentOverlays_PopoverSDefault,
            "SAccent" to s.Sdkit_StarDs_ComponentOverlays_PopoverSAccent,
        )
}
