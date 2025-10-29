package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionItemSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemSolidActionStartH5,
        )
}
