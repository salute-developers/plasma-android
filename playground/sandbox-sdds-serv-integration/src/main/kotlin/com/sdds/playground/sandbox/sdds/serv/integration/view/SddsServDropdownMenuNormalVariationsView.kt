package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDropdownMenuNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuNormalXs,
        )
}
