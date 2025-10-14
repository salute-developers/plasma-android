package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionItemClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionStartH5,
        )
}
