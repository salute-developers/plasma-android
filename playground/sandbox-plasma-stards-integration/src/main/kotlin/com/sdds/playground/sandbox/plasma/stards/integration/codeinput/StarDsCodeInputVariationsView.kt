package com.sdds.playground.sandbox.plasma.stards.integration.codeinput

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsCodeInputVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "SDefault" to s.Sdkit_StarDs_ComponentOverlays_CodeInputS,
            "MDefault" to s.Sdkit_StarDs_ComponentOverlays_CodeInputM,
            "LDefault" to s.Sdkit_StarDs_ComponentOverlays_CodeInputL,
        )
}
