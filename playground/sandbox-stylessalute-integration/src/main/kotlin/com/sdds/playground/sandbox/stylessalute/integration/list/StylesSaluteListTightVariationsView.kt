package com.sdds.playground.sandbox.stylessalute.integration.list

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to s.Salute_StylesSalute_ComponentOverlays_ListTightXl,
            "L" to s.Salute_StylesSalute_ComponentOverlays_ListTightL,
            "M" to s.Salute_StylesSalute_ComponentOverlays_ListTightM,
            "S" to s.Salute_StylesSalute_ComponentOverlays_ListTightS,
            "Xs" to s.Salute_StylesSalute_ComponentOverlays_ListTightXs,
        )
}
