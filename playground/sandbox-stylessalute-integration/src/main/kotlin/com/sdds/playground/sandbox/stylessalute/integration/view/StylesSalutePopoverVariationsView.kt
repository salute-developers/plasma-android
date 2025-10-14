package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSalutePopoverVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverM,
            "M.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverMDefault,
            "M.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverMAccent,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverS,
            "S.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverSDefault,
            "S.Accent" to DsR.style.Salute_StylesSalute_ComponentOverlays_PopoverSAccent,
        )
}
