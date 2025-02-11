package com.sdds.playground.sandbox.plasma.sd.service.integration.cell

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider

@Suppress("MaxLineLength")
internal object PlasmaSdServiceCellVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int>
        get() = mapOf(
            "L" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CellL,
            "M" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CellM,
            "S" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CellS,
            "Xs" to com.sdds.plasma.sd.service.R.style.Plasma_SdService_ComponentOverlays_CellXS,
        )
}
