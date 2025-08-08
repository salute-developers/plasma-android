package com.sdds.playground.sandbox.plasma.sd.service.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndL,
            "M" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndM,
            "S" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndXs,
            "H5" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH5,
            "H4" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH4,
            "H3" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH3,
            "H2" to s.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH2,
        )
}
