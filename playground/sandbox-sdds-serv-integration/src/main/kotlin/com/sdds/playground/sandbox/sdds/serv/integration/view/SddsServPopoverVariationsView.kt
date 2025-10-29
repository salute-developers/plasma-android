package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServPopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverM,
            "M.Default" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverMDefault,
            "M.Accent" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverMAccent,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverS,
            "S.Default" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverSDefault,
            "S.Accent" to DsR.style.Serv_Sdds_ComponentOverlays_PopoverSAccent,
        )
}
