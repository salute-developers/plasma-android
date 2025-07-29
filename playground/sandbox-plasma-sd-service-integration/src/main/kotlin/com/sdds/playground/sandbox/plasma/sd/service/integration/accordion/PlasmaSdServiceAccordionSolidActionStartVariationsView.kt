package com.sdds.playground.sandbox.plasma.sd.service.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartL,
            "M" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartM,
            "S" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartXs,
            "H5" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH5,
            "H4" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH4,
            "H3" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH3,
            "H2" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH2,
        )
}
