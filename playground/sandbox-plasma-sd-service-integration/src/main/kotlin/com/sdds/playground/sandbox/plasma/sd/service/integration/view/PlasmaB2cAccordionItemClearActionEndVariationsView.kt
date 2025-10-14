package com.sdds.playground.sandbox.plasma.sd.service.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.plasma.sd.service.R as DsR

internal object PlasmaB2cAccordionItemClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndXs,
            "S" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndS,
            "M" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndM,
            "L" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndL,
            "H2" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndH2,
            "H3" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndH3,
            "H4" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndH4,
            "H5" to DsR.style.Plasma_SdService_ComponentOverlays_AccordionItemClearActionEndH5,
        )
}
