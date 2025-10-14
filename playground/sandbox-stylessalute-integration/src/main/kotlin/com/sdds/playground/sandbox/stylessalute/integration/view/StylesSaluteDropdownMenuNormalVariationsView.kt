package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuNormalXs,
        )
}
