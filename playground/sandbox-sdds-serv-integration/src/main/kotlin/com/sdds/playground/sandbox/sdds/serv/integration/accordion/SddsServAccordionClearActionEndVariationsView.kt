package com.sdds.playground.sandbox.sdds.serv.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAccordionClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndL,
            "M" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndM,
            "S" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndXs,
            "H5" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH5,
            "H4" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH4,
            "H3" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH3,
            "H2" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionEndH2,
        )
}
