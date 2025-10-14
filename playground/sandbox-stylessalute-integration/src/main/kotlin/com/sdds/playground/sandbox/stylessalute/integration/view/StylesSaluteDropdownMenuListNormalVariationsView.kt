package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteDropdownMenuListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListNormalL,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListNormalM,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListNormalS,
            "Xs" to DsR.style.Salute_StylesSalute_ComponentOverlays_DropdownMenuListNormalXs,
        )
}
