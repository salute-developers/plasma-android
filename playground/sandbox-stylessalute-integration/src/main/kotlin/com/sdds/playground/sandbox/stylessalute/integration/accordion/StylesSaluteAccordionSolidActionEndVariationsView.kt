package com.sdds.playground.sandbox.stylessalute.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteAccordionSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndL,
            "M" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndS,
            "Xs" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndXs,
            "H5" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH5,
            "H4" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH4,
            "H3" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH3,
            "H2" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionEndH2,
        )
}
