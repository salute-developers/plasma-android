package com.sdds.playground.sandbox.sdds.serv.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.sdds.serv.integration.s

internal object SddsServAccordionClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartL,
            "M" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartM,
            "S" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartS,
            "Xs" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartXs,
            "H5" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH5,
            "H4" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH4,
            "H3" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH3,
            "H2" to s.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH2,
        )
}
