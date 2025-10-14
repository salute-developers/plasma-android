package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_CellL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_CellM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_CellS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_CellXs,
        )
}
