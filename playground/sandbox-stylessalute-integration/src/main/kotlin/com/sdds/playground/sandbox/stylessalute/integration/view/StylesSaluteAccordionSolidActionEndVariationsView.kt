package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH5,
        )
}
