package com.sdds.playground.sandbox.stylessalute.integration.cell.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> = mapOf(
        "L" to s.Salute_StylesSalute_ComponentOverlays_CellL,
        "M" to s.Salute_StylesSalute_ComponentOverlays_CellM,
        "S" to s.Salute_StylesSalute_ComponentOverlays_CellS,
        "Xs" to s.Salute_StylesSalute_ComponentOverlays_CellXs,
    )
}
