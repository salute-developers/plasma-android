package com.sdds.playground.sandbox.plasma.sd.service.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAccordionClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartL,
            "M" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartM,
            "S" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartXs,
            "H5" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH5,
            "H4" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH4,
            "H3" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH3,
            "H2" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionStartH2,
        )
}
