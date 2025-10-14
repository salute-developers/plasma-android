package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionEndH5,
        )
}
