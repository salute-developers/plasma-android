package com.sdds.playground.sandbox.sdds.serv.integration.cell.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_CellL,
            "M" to s.Serv_Sdds_ComponentOverlays_CellM,
            "S" to s.Serv_Sdds_ComponentOverlays_CellS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_CellXS,
        )
}
