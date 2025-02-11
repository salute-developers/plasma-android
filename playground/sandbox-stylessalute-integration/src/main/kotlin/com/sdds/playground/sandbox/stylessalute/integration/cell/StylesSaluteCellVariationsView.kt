package com.sdds.playground.sandbox.stylessalute.integration.cell

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object StylesSaluteCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CellL,
            "M" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CellM,
            "S" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CellS,
            "Xs" to com.sdds.stylessalute.R.style.Salute_StylesSalute_ComponentOverlays_CellXS,
        )
}
