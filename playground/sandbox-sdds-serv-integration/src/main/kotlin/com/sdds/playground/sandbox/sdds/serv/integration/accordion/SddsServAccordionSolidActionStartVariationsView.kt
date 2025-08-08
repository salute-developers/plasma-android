package com.sdds.playground.sandbox.sdds.serv.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartL,
            "M" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartM,
            "S" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartXs,
            "H5" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH5,
            "H4" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH4,
            "H3" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH3,
            "H2" to s.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH2,
        )
}
