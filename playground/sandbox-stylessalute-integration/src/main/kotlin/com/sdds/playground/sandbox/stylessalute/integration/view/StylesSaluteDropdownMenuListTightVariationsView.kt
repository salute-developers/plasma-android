package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteDropdownMenuListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListTightL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListTightM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListTightS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListTightXs,
        )
}
