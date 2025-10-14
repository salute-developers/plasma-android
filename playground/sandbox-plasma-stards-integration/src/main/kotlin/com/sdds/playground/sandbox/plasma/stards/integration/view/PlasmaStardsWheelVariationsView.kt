package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsWheelVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            "H1" to DsR.style.Sdkit_StarDs_ComponentOverlays_WheelH1,
            "H1.RightAlign" to DsR.style.Sdkit_StarDs_ComponentOverlays_WheelH1RightAlign,
            "H1.CenterAlign" to DsR.style.Sdkit_StarDs_ComponentOverlays_WheelH1CenterAlign,
            "H1.LeftAlign" to DsR.style.Sdkit_StarDs_ComponentOverlays_WheelH1LeftAlign,
            "H1.MixedAlign" to DsR.style.Sdkit_StarDs_ComponentOverlays_WheelH1MixedAlign,
        )
}
