package com.sdds.playground.sandbox.stylessalute.integration.codeinput

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.stylessalute.integration.s

internal object StylesSaluteCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SDefault" to s.Salute_StylesSalute_ComponentOverlays_CodeInputS,
            "MDefault" to s.Salute_StylesSalute_ComponentOverlays_CodeInputM,
            "LDefault" to s.Salute_StylesSalute_ComponentOverlays_CodeInputL,
        )
}
