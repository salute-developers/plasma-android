package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServDropdownMenuTightVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "Xl" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuTightXl,
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuTightL,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuTightM,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuTightS,
            "Xs" to DsR.style.Serv_Sdds_ComponentOverlays_DropdownMenuTightXs,
        )
}
