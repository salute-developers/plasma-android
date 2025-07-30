package com.sdds.playground.sandbox.plasma.stards.integration.scrollbar

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsScrollBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to s.Sdkit_StarDs_ComponentOverlays_ScrollBarM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_ScrollBarS,
        )
}
