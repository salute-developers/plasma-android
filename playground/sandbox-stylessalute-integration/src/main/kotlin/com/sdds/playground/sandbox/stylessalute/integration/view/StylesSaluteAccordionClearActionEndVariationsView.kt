package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionClearActionEndVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionEndH5,
        )
}
