package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDropdownMenuListNormalVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListNormalXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListNormalL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListNormalM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListNormalS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListNormalXs,
        )
}
