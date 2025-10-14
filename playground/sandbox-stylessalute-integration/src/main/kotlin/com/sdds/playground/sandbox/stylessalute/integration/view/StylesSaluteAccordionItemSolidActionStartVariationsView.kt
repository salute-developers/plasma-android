package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionItemSolidActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionStartH5,
        )
}
