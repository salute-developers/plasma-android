package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteListItemNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemNormalXl,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemNormalL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemNormalM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemNormalS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListItemNormalXs,
        )
}
