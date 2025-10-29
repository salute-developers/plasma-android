package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionItemSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionStartH5,
        )
}
