package com.sdds.playground.sandbox.plasma.stards.integration.button.basic

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsBasicButtonVariationsView : ViewStyleProvider<String>() {

    override val variations: Map<String, Int> =
        mapOf(
            "L" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonL,
            "M" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonM,
            "S" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonS,
            "Xs" to s.Sdkit_StarDs_ComponentOverlays_BasicButtonXs,
        )
}
