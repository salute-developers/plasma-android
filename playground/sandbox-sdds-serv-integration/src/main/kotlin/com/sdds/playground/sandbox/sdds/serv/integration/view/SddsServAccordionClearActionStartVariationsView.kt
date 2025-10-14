package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionClearActionStartH5,
        )
}
