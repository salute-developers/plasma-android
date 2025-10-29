package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListNormalXl,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListNormalL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListNormalM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListNormalS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListNormalXs,
        )
}
