package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteDropdownMenuTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuTightL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuTightM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuTightS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuTightXs,
        )
}
