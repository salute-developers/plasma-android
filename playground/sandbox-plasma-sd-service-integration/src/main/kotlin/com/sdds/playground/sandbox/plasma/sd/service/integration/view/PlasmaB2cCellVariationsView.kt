package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_CellL,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_CellM,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_CellS,
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_CellXs,
        )
}
