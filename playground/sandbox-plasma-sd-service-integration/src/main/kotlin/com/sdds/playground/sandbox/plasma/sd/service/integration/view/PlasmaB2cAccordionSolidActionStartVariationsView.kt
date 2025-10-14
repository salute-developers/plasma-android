package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionSolidActionStartH5,
        )
}
