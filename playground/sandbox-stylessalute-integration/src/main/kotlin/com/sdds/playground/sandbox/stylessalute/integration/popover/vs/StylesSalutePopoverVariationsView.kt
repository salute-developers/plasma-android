package com.sdds.playground.sandbox.stylessalute.integration.popover.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSalutePopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "MDefault" to s.Salute_StylesSalute_ComponentOverlays_PopoverMDefault,
            "MAccent" to s.Salute_StylesSalute_ComponentOverlays_PopoverMAccent,
            "SDefault" to s.Salute_StylesSalute_ComponentOverlays_PopoverSDefault,
            "SAccent" to s.Salute_StylesSalute_ComponentOverlays_PopoverSAccent,
        )
}
