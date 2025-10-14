package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionItemSolidActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionItemSolidActionEndH5,
        )
}
