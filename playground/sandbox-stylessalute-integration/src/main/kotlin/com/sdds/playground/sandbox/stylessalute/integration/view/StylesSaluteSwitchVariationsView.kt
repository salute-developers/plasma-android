package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteSwitchVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchL,
            "L.ToggleS" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchLToggleS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchM,
            "M.ToggleS" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchMToggleS,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchS,
            "S.ToggleS" to DsR.style.Salute_StylesSalute_ComponentOverlays_SwitchSToggleS,
        )
}
