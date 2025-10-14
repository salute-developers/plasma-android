package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH5,
        )
}
