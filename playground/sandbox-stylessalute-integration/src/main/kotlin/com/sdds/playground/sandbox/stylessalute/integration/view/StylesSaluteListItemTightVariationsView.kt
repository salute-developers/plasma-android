package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteListItemTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemTightXl,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemTightL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemTightM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemTightS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemTightXs,
        )
}
