package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListTightXl,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListTightL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListTightM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListTightS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_ListTightXs,
        )
}
