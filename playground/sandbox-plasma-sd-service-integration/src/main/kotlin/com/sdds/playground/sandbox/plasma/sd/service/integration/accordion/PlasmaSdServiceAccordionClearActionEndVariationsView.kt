package com.sdds.playground.sandbox.plasma.sd.service.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.sd.service.integration.s

internal object PlasmaSdServiceAccordionClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndL,
            "M" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndM,
            "S" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndS,
            "Xs" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndXs,
            "H5" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH5,
            "H4" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH4,
            "H3" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH3,
            "H2" to s.Plasma_SdService_ComponentOverlays_AccordionClearActionEndH2,
        )
}
