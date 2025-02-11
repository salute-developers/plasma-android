package com.sdds.playground.sandbox.sdds.serv.integration.cell

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

internal object SddsServCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CellL,
            "M" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CellM,
            "S" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CellS,
            "Xs" to com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_CellXS,
        )
}
