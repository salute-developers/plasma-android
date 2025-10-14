package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH5,
        )
}
