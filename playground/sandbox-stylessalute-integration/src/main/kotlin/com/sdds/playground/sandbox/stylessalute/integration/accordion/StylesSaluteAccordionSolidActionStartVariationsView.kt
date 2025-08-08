package com.sdds.playground.sandbox.stylessalute.integration.accordion

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartL,
            "M" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartS,
            "Xs" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartXs,
            "H5" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH5,
            "H4" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH4,
            "H3" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH3,
            "H2" to s.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH2,
        )
}
