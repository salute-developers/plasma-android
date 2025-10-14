package com.sdds.playground.sandbox.stylessalute.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.stylessalute.R as DsR

internal object StylesSaluteCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "S" to DsR.style.Salute_StylesSalute_ComponentOverlays_CodeInputS,
            "M" to DsR.style.Salute_StylesSalute_ComponentOverlays_CodeInputM,
            "L" to DsR.style.Salute_StylesSalute_ComponentOverlays_CodeInputL,
        )
}
