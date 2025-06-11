package com.sdds.playground.sandbox.plasma.stards.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsListVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_ListL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_ListM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_ListS,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_ListXs,
        )
}
