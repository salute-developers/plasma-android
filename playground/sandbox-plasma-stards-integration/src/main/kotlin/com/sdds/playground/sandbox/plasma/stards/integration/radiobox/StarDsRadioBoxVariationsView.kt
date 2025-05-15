package com.sdds.playground.sandbox.plasma.stards.integration.radiobox

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsRadioBoxVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_RadioBoxL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_RadioBoxM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_RadioBoxS,
        )
}
