package com.sdds.playground.sandbox.stylessalute.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Salute_StylesSalute_ComponentOverlays_ListNormalXl,
            "L" to s.Salute_StylesSalute_ComponentOverlays_ListNormalL,
            "M" to s.Salute_StylesSalute_ComponentOverlays_ListNormalM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_ListNormalS,
            "Xs" to s.Salute_StylesSalute_ComponentOverlays_ListNormalXs,
        )
}
