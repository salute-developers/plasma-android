package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH5,
        )
}
