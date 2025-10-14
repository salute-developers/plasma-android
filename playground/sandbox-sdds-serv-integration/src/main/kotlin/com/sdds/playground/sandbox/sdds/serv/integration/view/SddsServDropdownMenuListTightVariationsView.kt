package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDropdownMenuListTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuListTightXs,
        )
}
