package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteAccordionClearActionStartVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartXs,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartL,
            "H2" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartH2,
            "H3" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartH3,
            "H4" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartH4,
            "H5" to DsR.style.Salute_StylesSalute_ComponentOverlays_AccordionClearActionStartH5,
        )
}
