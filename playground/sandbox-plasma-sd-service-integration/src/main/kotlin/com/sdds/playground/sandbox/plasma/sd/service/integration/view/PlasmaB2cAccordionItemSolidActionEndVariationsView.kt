package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionItemSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemSolidActionEndH5,
        )
}
