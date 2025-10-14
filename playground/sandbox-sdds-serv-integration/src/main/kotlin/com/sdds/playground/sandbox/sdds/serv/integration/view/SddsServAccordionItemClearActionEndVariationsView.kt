package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionItemClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionItemClearActionEndH5,
        )
}
