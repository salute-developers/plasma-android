package com.sdds.playground.sandbox.plasma.sd.service.integration.cell.vs

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_CellL,
            "M" to s.Plasma_SdService_ComponentOverlays_CellM,
            "S" to s.Plasma_SdService_ComponentOverlays_CellS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_CellXs,
        )
}
