package com.sdds.playground.sandbox.plasma.stards.integration.cell.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_CellL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_CellM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_CellS,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_CellXS,
        )
}
