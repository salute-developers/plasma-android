package com.sdds.playground.sandbox.plasma.stards.integration.view

import com.sdds.playground.sandbox.core.integration.ViewStyleProvider
import com.sdkit.star.designsystem.R as DsR

internal object PlasmaStardsProgressBarVariationsView : ViewStyleProvider<String>() {
    override val variations: Map<String, Int> =
        mapOf(
            ".Default" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarDefault,
            ".Secondary" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarSecondary,
            ".Accent" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarAccent,
            ".Gradient" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarGradient,
            ".Info" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarInfo,
            ".Negative" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarNegative,
            ".Positive" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarPositive,
            ".Warning" to DsR.style.Sdkit_StarDs_ComponentOverlays_ProgressBarWarning,
        )
}
