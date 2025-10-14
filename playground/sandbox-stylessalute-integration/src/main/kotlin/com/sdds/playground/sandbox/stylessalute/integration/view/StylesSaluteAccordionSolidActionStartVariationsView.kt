package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionSolidActionStartH5,
        )
}
