package com.sdds.playground.sandbox.sdds.serv.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL,
            "M" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndM,
            "S" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndXs,
            "H5" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH5,
            "H4" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH4,
            "H3" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH3,
            "H2" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH2,
        )
}
