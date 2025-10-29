package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndXs,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndM,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndL,
            "H2" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH2,
            "H3" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH3,
            "H4" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH4,
            "H5" to DsR.style.Serv_Sdds_ComponentOverlays_AccordionSolidActionEndH5,
        )
}
