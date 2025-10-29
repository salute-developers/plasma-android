package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionStartH5,
        )
}
