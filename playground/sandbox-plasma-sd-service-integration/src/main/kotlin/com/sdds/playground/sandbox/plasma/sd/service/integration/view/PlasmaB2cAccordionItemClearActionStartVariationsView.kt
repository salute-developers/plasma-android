package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionItemClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionStartH5,
        )
}
