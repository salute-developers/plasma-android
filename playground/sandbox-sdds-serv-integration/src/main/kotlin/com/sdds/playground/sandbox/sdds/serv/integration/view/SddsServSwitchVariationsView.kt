package com.sdds.playground.sandbox.sdds.serv.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.serv.R as DsR

internal object SddsServSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchL,
            "L.ToggleS" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchLToggleS,
            "M" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchM,
            "M.ToggleS" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchMToggleS,
            "S" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchS,
            "S.ToggleS" to DsR.style.Serv_Sdds_ComponentOverlays_SwitchSToggleS,
        )
}
