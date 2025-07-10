package com.sdds.playground.sandbox.plasma.stards.integration.wheel

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdds.playground.sandbox.plasma.stards.integration.s

internal object StarDsWheelVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1MixedAlign" to s.Sdkit_StarDs_ComponentOverlays_WheelH1MixedAlign,
            "H1LeftAlign" to s.Sdkit_StarDs_ComponentOverlays_WheelH1LeftAlign,
            "H1CenterAlign" to s.Sdkit_StarDs_ComponentOverlays_WheelH1CenterAlign,
            "H1RightAlign" to s.Sdkit_StarDs_ComponentOverlays_WheelH1RightAlign,
        )
}
