package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteCheckBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_CheckBoxM,
            "M.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_CheckBoxMDefault,
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_CheckBoxS,
            "S.Default" to DsR.style.Salute_StylesSalute_ComponentOverlays_CheckBoxSDefault,
        )
}
