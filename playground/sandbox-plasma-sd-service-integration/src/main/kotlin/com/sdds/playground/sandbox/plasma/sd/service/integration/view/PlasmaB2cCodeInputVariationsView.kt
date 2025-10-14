package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_CodeInputS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_CodeInputM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_CodeInputL,
        )
}
